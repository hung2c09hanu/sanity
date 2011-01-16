package cri.sanity;

import java.util.Currency;
import java.util.Locale;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;


public class ScreenAbout extends ActivityScreen
{
	@Override
  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
  	on("eula"     , new Click(){ boolean on(){ return A.gotoUrl(Conf.EULA_URL); }});
  	on("comment"  , new Click(){ boolean on(){ return A.gotoMarketDetails();    }});
  	on("changelog", new Click(){ boolean on(){ alertChangeLog(); return true;   }});
  	on("mail"     , new Click(){ boolean on(){ return mailToDeveloper();        }});
  	on("paypal"   , new Click(){ boolean on(){ return A.gotoUrl(Conf.DONATE_URL.replace(Conf.CURRENCY_VAR, Currency.getInstance(Locale.getDefault()).getCurrencyCode())); }});
  }

	private boolean mailToDeveloper()
	{
		final Intent i = new Intent(android.content.Intent.ACTION_SEND);
		i.setType("text/html");
		i.putExtra(Intent.EXTRA_EMAIL  , new String[]{ Conf.AUTHOR_EMAIL });
		i.putExtra(Intent.EXTRA_SUBJECT, getAppFullName());
		i.putExtra(Intent.EXTRA_TEXT   , Html.fromHtml(A.tr(R.string.msg_email_body)+"<br />"));
		startActivity(Intent.createChooser(i, A.tr(R.string.msg_email_choose)));
		return true;
	}

}