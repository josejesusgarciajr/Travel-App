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

public class MapFragmentDirections {
  private MapFragmentDirections() {
  }

  @NonNull
  public static ActionMapFragmentToAddLandmarkFragment actionMapFragmentToAddLandmarkFragment(float latitude,
      float longitude, @NonNull String loggedInUserId) {
    return new ActionMapFragmentToAddLandmarkFragment(latitude, longitude, loggedInUserId);
  }

  @NonNull
  public static ActionMapFragmentToLandmarkFragment actionMapFragmentToLandmarkFragment(@NonNull String landmarkTitle,
      @NonNull String landmarkDescription, float landmarkRating, @NonNull String landmarkId,
      @NonNull String landmarkAuthorId, @NonNull String landmarkLoggedInUserId) {
    return new ActionMapFragmentToLandmarkFragment(landmarkTitle, landmarkDescription, landmarkRating, landmarkId, landmarkAuthorId, landmarkLoggedInUserId);
  }

  public static class ActionMapFragmentToAddLandmarkFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionMapFragmentToAddLandmarkFragment(float latitude, float longitude,
        @NonNull String loggedInUserId) {
      this.arguments.put("latitude", latitude);
      this.arguments.put("longitude", longitude);
      if (loggedInUserId == null) {
        throw new IllegalArgumentException("Argument \"loggedInUserId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("loggedInUserId", loggedInUserId);
    }

    @NonNull
    public ActionMapFragmentToAddLandmarkFragment setLatitude(float latitude) {
      this.arguments.put("latitude", latitude);
      return this;
    }

    @NonNull
    public ActionMapFragmentToAddLandmarkFragment setLongitude(float longitude) {
      this.arguments.put("longitude", longitude);
      return this;
    }

    @NonNull
    public ActionMapFragmentToAddLandmarkFragment setLoggedInUserId(@NonNull String loggedInUserId) {
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
    public int getActionId() {
      return R.id.action_mapFragment_to_addLandmarkFragment;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionMapFragmentToAddLandmarkFragment that = (ActionMapFragmentToAddLandmarkFragment) object;
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
      if (getActionId() != that.getActionId()) {
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
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionMapFragmentToAddLandmarkFragment(actionId=" + getActionId() + "){"
          + "latitude=" + getLatitude()
          + ", longitude=" + getLongitude()
          + ", loggedInUserId=" + getLoggedInUserId()
          + "}";
    }
  }

  public static class ActionMapFragmentToLandmarkFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionMapFragmentToLandmarkFragment(@NonNull String landmarkTitle,
        @NonNull String landmarkDescription, float landmarkRating, @NonNull String landmarkId,
        @NonNull String landmarkAuthorId, @NonNull String landmarkLoggedInUserId) {
      if (landmarkTitle == null) {
        throw new IllegalArgumentException("Argument \"landmarkTitle\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("landmarkTitle", landmarkTitle);
      if (landmarkDescription == null) {
        throw new IllegalArgumentException("Argument \"landmarkDescription\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("landmarkDescription", landmarkDescription);
      this.arguments.put("landmarkRating", landmarkRating);
      if (landmarkId == null) {
        throw new IllegalArgumentException("Argument \"landmarkId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("landmarkId", landmarkId);
      if (landmarkAuthorId == null) {
        throw new IllegalArgumentException("Argument \"landmarkAuthorId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("landmarkAuthorId", landmarkAuthorId);
      if (landmarkLoggedInUserId == null) {
        throw new IllegalArgumentException("Argument \"landmarkLoggedInUserId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("landmarkLoggedInUserId", landmarkLoggedInUserId);
    }

    @NonNull
    public ActionMapFragmentToLandmarkFragment setLandmarkTitle(@NonNull String landmarkTitle) {
      if (landmarkTitle == null) {
        throw new IllegalArgumentException("Argument \"landmarkTitle\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("landmarkTitle", landmarkTitle);
      return this;
    }

    @NonNull
    public ActionMapFragmentToLandmarkFragment setLandmarkDescription(@NonNull String landmarkDescription) {
      if (landmarkDescription == null) {
        throw new IllegalArgumentException("Argument \"landmarkDescription\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("landmarkDescription", landmarkDescription);
      return this;
    }

    @NonNull
    public ActionMapFragmentToLandmarkFragment setLandmarkRating(float landmarkRating) {
      this.arguments.put("landmarkRating", landmarkRating);
      return this;
    }

    @NonNull
    public ActionMapFragmentToLandmarkFragment setLandmarkId(@NonNull String landmarkId) {
      if (landmarkId == null) {
        throw new IllegalArgumentException("Argument \"landmarkId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("landmarkId", landmarkId);
      return this;
    }

    @NonNull
    public ActionMapFragmentToLandmarkFragment setLandmarkAuthorId(@NonNull String landmarkAuthorId) {
      if (landmarkAuthorId == null) {
        throw new IllegalArgumentException("Argument \"landmarkAuthorId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("landmarkAuthorId", landmarkAuthorId);
      return this;
    }

    @NonNull
    public ActionMapFragmentToLandmarkFragment setLandmarkLoggedInUserId(@NonNull String landmarkLoggedInUserId) {
      if (landmarkLoggedInUserId == null) {
        throw new IllegalArgumentException("Argument \"landmarkLoggedInUserId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("landmarkLoggedInUserId", landmarkLoggedInUserId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("landmarkTitle")) {
        String landmarkTitle = (String) arguments.get("landmarkTitle");
        __result.putString("landmarkTitle", landmarkTitle);
      }
      if (arguments.containsKey("landmarkDescription")) {
        String landmarkDescription = (String) arguments.get("landmarkDescription");
        __result.putString("landmarkDescription", landmarkDescription);
      }
      if (arguments.containsKey("landmarkRating")) {
        float landmarkRating = (float) arguments.get("landmarkRating");
        __result.putFloat("landmarkRating", landmarkRating);
      }
      if (arguments.containsKey("landmarkId")) {
        String landmarkId = (String) arguments.get("landmarkId");
        __result.putString("landmarkId", landmarkId);
      }
      if (arguments.containsKey("landmarkAuthorId")) {
        String landmarkAuthorId = (String) arguments.get("landmarkAuthorId");
        __result.putString("landmarkAuthorId", landmarkAuthorId);
      }
      if (arguments.containsKey("landmarkLoggedInUserId")) {
        String landmarkLoggedInUserId = (String) arguments.get("landmarkLoggedInUserId");
        __result.putString("landmarkLoggedInUserId", landmarkLoggedInUserId);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_mapFragment_to_landmarkFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getLandmarkTitle() {
      return (String) arguments.get("landmarkTitle");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getLandmarkDescription() {
      return (String) arguments.get("landmarkDescription");
    }

    @SuppressWarnings("unchecked")
    public float getLandmarkRating() {
      return (float) arguments.get("landmarkRating");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getLandmarkId() {
      return (String) arguments.get("landmarkId");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getLandmarkAuthorId() {
      return (String) arguments.get("landmarkAuthorId");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getLandmarkLoggedInUserId() {
      return (String) arguments.get("landmarkLoggedInUserId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionMapFragmentToLandmarkFragment that = (ActionMapFragmentToLandmarkFragment) object;
      if (arguments.containsKey("landmarkTitle") != that.arguments.containsKey("landmarkTitle")) {
        return false;
      }
      if (getLandmarkTitle() != null ? !getLandmarkTitle().equals(that.getLandmarkTitle()) : that.getLandmarkTitle() != null) {
        return false;
      }
      if (arguments.containsKey("landmarkDescription") != that.arguments.containsKey("landmarkDescription")) {
        return false;
      }
      if (getLandmarkDescription() != null ? !getLandmarkDescription().equals(that.getLandmarkDescription()) : that.getLandmarkDescription() != null) {
        return false;
      }
      if (arguments.containsKey("landmarkRating") != that.arguments.containsKey("landmarkRating")) {
        return false;
      }
      if (Float.compare(that.getLandmarkRating(), getLandmarkRating()) != 0) {
        return false;
      }
      if (arguments.containsKey("landmarkId") != that.arguments.containsKey("landmarkId")) {
        return false;
      }
      if (getLandmarkId() != null ? !getLandmarkId().equals(that.getLandmarkId()) : that.getLandmarkId() != null) {
        return false;
      }
      if (arguments.containsKey("landmarkAuthorId") != that.arguments.containsKey("landmarkAuthorId")) {
        return false;
      }
      if (getLandmarkAuthorId() != null ? !getLandmarkAuthorId().equals(that.getLandmarkAuthorId()) : that.getLandmarkAuthorId() != null) {
        return false;
      }
      if (arguments.containsKey("landmarkLoggedInUserId") != that.arguments.containsKey("landmarkLoggedInUserId")) {
        return false;
      }
      if (getLandmarkLoggedInUserId() != null ? !getLandmarkLoggedInUserId().equals(that.getLandmarkLoggedInUserId()) : that.getLandmarkLoggedInUserId() != null) {
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
      result = 31 * result + (getLandmarkTitle() != null ? getLandmarkTitle().hashCode() : 0);
      result = 31 * result + (getLandmarkDescription() != null ? getLandmarkDescription().hashCode() : 0);
      result = 31 * result + Float.floatToIntBits(getLandmarkRating());
      result = 31 * result + (getLandmarkId() != null ? getLandmarkId().hashCode() : 0);
      result = 31 * result + (getLandmarkAuthorId() != null ? getLandmarkAuthorId().hashCode() : 0);
      result = 31 * result + (getLandmarkLoggedInUserId() != null ? getLandmarkLoggedInUserId().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionMapFragmentToLandmarkFragment(actionId=" + getActionId() + "){"
          + "landmarkTitle=" + getLandmarkTitle()
          + ", landmarkDescription=" + getLandmarkDescription()
          + ", landmarkRating=" + getLandmarkRating()
          + ", landmarkId=" + getLandmarkId()
          + ", landmarkAuthorId=" + getLandmarkAuthorId()
          + ", landmarkLoggedInUserId=" + getLandmarkLoggedInUserId()
          + "}";
    }
  }
}
