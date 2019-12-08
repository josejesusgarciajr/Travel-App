package jwest.android_class.travel_app;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class Log_InDirections {
  private Log_InDirections() {
  }

  @NonNull
  public static NavDirections logInToGoogleMaps() {
    return new ActionOnlyNavDirections(R.id.logIn_To_Google_Maps);
  }
}
