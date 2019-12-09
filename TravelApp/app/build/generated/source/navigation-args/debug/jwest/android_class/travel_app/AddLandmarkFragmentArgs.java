package jwest.android_class.travel_app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class AddLandmarkFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private AddLandmarkFragmentArgs() {
  }

  private AddLandmarkFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static AddLandmarkFragmentArgs fromBundle(@NonNull Bundle bundle) {
    AddLandmarkFragmentArgs __result = new AddLandmarkFragmentArgs();
    bundle.setClassLoader(AddLandmarkFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("latitude")) {
      float latitude;
      latitude = bundle.getFloat("latitude");
      __result.arguments.put("latitude", latitude);
    } else {
      throw new IllegalArgumentException("Required argument \"latitude\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("longitude")) {
      float longitude;
      longitude = bundle.getFloat("longitude");
      __result.arguments.put("longitude", longitude);
    } else {
      throw new IllegalArgumentException("Required argument \"longitude\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("loggedInUserId")) {
      String loggedInUserId;
      loggedInUserId = bundle.getString("loggedInUserId");
      if (loggedInUserId == null) {
        throw new IllegalArgumentException("Argument \"loggedInUserId\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("loggedInUserId", loggedInUserId);
    } else {
      throw new IllegalArgumentException("Required argument \"loggedInUserId\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public float getLatitude() {
    return (float) arguments.get("latitude");
  }

  @SuppressWarnings("unchecked")
  public float getLongitude() {
    return (float) arguments.get("longitude");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getLoggedInUserId() {
    return (String) arguments.get("loggedInUserId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("latitude")) {
      float latitude = (float) arguments.get("latitude");
      __result.putFloat("latitude", latitude);
    }
    if (arguments.containsKey("longitude")) {
      float longitude = (float) arguments.get("longitude");
      __result.putFloat("longitude", longitude);
    }
    if (arguments.containsKey("loggedInUserId")) {
      String loggedInUserId = (String) arguments.get("loggedInUserId");
      __result.putString("loggedInUserId", loggedInUserId);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    AddLandmarkFragmentArgs that = (AddLandmarkFragmentArgs) object;
    if (arguments.containsKey("latitude") != that.arguments.containsKey("latitude")) {
      return false;
    }
    if (Float.compare(that.getLatitude(), getLatitude()) != 0) {
      return false;
    }
    if (arguments.containsKey("longitude") != that.arguments.containsKey("longitude")) {
      return false;
    }
    if (Float.compare(that.getLongitude(), getLongitude()) != 0) {
      return false;
    }
    if (arguments.containsKey("loggedInUserId") != that.arguments.containsKey("loggedInUserId")) {
      return false;
    }
    if (getLoggedInUserId() != null ? !getLoggedInUserId().equals(that.getLoggedInUserId()) : that.getLoggedInUserId() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + Float.floatToIntBits(getLatitude());
    result = 31 * result + Float.floatToIntBits(getLongitude());
    result = 31 * result + (getLoggedInUserId() != null ? getLoggedInUserId().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "AddLandmarkFragmentArgs{"
        + "latitude=" + getLatitude()
        + ", longitude=" + getLongitude()
        + ", loggedInUserId=" + getLoggedInUserId()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(AddLandmarkFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(float latitude, float longitude, @NonNull String loggedInUserId) {
      this.arguments.put("latitude", latitude);
      this.arguments.put("longitude", longitude);
      if (loggedInUserId == null) {
        throw new IllegalArgumentException("Argument \"loggedInUserId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("loggedInUserId", loggedInUserId);
    }

    @NonNull
    public AddLandmarkFragmentArgs build() {
      AddLandmarkFragmentArgs result = new AddLandmarkFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setLatitude(float latitude) {
      this.arguments.put("latitude", latitude);
      return this;
    }

    @NonNull
    public Builder setLongitude(float longitude) {
      this.arguments.put("longitude", longitude);
      return this;
    }

    @NonNull
    public Builder setLoggedInUserId(@NonNull String loggedInUserId) {
      if (loggedInUserId == null) {
        throw new IllegalArgumentException("Argument \"loggedInUserId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("loggedInUserId", loggedInUserId);
      return this;
    }

    @SuppressWarnings("unchecked")
    public float getLatitude() {
      return (float) arguments.get("latitude");
    }

    @SuppressWarnings("unchecked")
    public float getLongitude() {
      return (float) arguments.get("longitude");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getLoggedInUserId() {
      return (String) arguments.get("loggedInUserId");
    }
  }
}
