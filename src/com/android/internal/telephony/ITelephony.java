package com.android.internal.telephony;

//import java.util.List;
//import android.os.Bundle;
//import android.telephony.NeighboringCellInfo;


public interface ITelephony
{
  boolean endCall();
  boolean showCallScreen();
  boolean enableDataConnectivity();
  boolean disableDataConnectivity();
  /*
  boolean showCallScreenWithDialpad(boolean showDialpad);
  void dial(String number);
  void call(String number);
  void answerRingingCall();
  void silenceRinger();
  boolean isOffhook();
  boolean isRinging();
  boolean isIdle();
  boolean isRadioOn();
  boolean isSimPinEnabled();
  void cancelMissedCallsNotification();
  boolean supplyPin(String pin);
  boolean handlePinMmi(String dialString);
  void toggleRadioOnOff();
  boolean setRadio(boolean turnOn);
  void updateServiceLocation();
  void enableLocationUpdates();
  void disableLocationUpdates();
  int enableApnType(String type);
  int disableApnType(String type);
  boolean isDataConnectivityPossible();
  Bundle getCellLocation();
  List<NeighboringCellInfo> getNeighboringCellInfo();
  int getCallState();
  int getDataActivity();
  int getDataState();
  int getActivePhoneType();
  int getCdmaEriIconIndex();
  int getCdmaEriIconMode();
  String getCdmaEriText();
  boolean getCdmaNeedsProvisioning();
  int getVoiceMessageCount();
  int getNetworkType();
  boolean hasIccCard();
  String transmitIccLogicalChannel(int cla, int command, int channel, int p1, int p2, int p3, String data);
  String transmitIccAPDU(int cla, int command, int p1, int p2, int p3, String data);
  int openIccLogicalChannel(String AID);
  void closeIccLogicalChannel(int channel);
  */
}
