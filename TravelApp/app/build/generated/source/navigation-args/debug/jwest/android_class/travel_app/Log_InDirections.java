package jwest.android_class.travel_app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class Log_InDirections {
  private Log_InDirections() {
  }

  @NonNull
  public static LogInToGoogleMaps logInToGoogleMaps(@NonNull String loggedInUserId) {
    return new LogInToGoogleMaps(loggedInUserId);
  }

  public static class LogInToGoogleMaps implements NavDirections {
    private final HashMap arguments = new HashMap();

    private LogInToGoogleMaps(@NonNull String loggedInUserId) {
      if (loggedInUserId == null) {
        throw new IllegalArgumentException("Argument \"loggedInUserId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("loggedInUserId", loggedInUserId);
    }

    @NonNull
    public LogInToGoogleMaps setLoggedInUserId(@NonNull String loggedInUserId) {
      if (loggedInUserId == null) {
        throw new IllegalArgumentException("Argument \"loggedInUserId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("loggedInUserId", loggedInUserId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("loggedInUserId")) {
        String loggedInUserId = (String) arguments.get("loggedInUserId");
        __result.putString("loggedInUserId", loggedInUserId);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.logIn_To_Google_Maps;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getLoggedInUserId() {
      return (String) arguments.get("loggedInUserId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      LogInToGoogleMaps that = (LogInToGoogleMaps) object;
      if (arguments.containsKey("loggedInUserId") != that.arguments.containsKey("loggedInUserId")) {
        return false;
      }
      if (getLoggedInUserId() != null ? !getLoggedInUserId().equals(that.getLoggedInUserId()) : that.getLoggedInUserId() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getLoggedInUserId() != null ? getLoggedInUserId().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "LogInToGoogleMaps(actionId=" + getActionId() + "){"
          + "loggedInUserId=" + getLoggedInUserId()
          + "}";
    }
  }
}
