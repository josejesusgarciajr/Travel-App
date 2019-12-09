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

public class AddLandmarkFragmentDirections {
  private AddLandmarkFragmentDirections() {
  }

  @NonNull
  public static ActionAddLandmarkFragmentToMapFragment actionAddLandmarkFragmentToMapFragment(@NonNull String loggedInUserId) {
    return new ActionAddLandmarkFragmentToMapFragment(loggedInUserId);
  }

  public static class ActionAddLandmarkFragmentToMapFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionAddLandmarkFragmentToMapFragment(@NonNull String loggedInUserId) {
      if (loggedInUserId == null) {
        throw new IllegalArgumentException("Argument \"loggedInUserId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("loggedInUserId", loggedInUserId);
    }

    @NonNull
    public ActionAddLandmarkFragmentToMapFragment setLoggedInUserId(@NonNull String loggedInUserId) {
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
      return R.id.action_addLandmarkFragment_to_mapFragment;
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
      ActionAddLandmarkFragmentToMapFragment that = (ActionAddLandmarkFragmentToMapFragment) object;
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
      return "ActionAddLandmarkFragmentToMapFragment(actionId=" + getActionId() + "){"
          + "loggedInUserId=" + getLoggedInUserId()
          + "}";
    }
  }
}
