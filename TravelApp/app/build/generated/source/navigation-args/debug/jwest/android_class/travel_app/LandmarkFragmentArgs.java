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

public class LandmarkFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private LandmarkFragmentArgs() {
  }

  private LandmarkFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static LandmarkFragmentArgs fromBundle(@NonNull Bundle bundle) {
    LandmarkFragmentArgs __result = new LandmarkFragmentArgs();
    bundle.setClassLoader(LandmarkFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("landmarkTitle")) {
      String landmarkTitle;
      landmarkTitle = bundle.getString("landmarkTitle");
      if (landmarkTitle == null) {
        throw new IllegalArgumentException("Argument \"landmarkTitle\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("landmarkTitle", landmarkTitle);
    } else {
      throw new IllegalArgumentException("Required argument \"landmarkTitle\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("landmarkDescription")) {
      String landmarkDescription;
      landmarkDescription = bundle.getString("landmarkDescription");
      if (landmarkDescription == null) {
        throw new IllegalArgumentException("Argument \"landmarkDescription\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("landmarkDescription", landmarkDescription);
    } else {
      throw new IllegalArgumentException("Required argument \"landmarkDescription\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("landmarkRating")) {
      float landmarkRating;
      landmarkRating = bundle.getFloat("landmarkRating");
      __result.arguments.put("landmarkRating", landmarkRating);
    } else {
      throw new IllegalArgumentException("Required argument \"landmarkRating\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("landmarkId")) {
      String landmarkId;
      landmarkId = bundle.getString("landmarkId");
      if (landmarkId == null) {
        throw new IllegalArgumentException("Argument \"landmarkId\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("landmarkId", landmarkId);
    } else {
      throw new IllegalArgumentException("Required argument \"landmarkId\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("landmarkAuthorId")) {
      String landmarkAuthorId;
      landmarkAuthorId = bundle.getString("landmarkAuthorId");
      if (landmarkAuthorId == null) {
        throw new IllegalArgumentException("Argument \"landmarkAuthorId\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("landmarkAuthorId", landmarkAuthorId);
    } else {
      throw new IllegalArgumentException("Required argument \"landmarkAuthorId\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("landmarkAuthorName")) {
      String landmarkAuthorName;
      landmarkAuthorName = bundle.getString("landmarkAuthorName");
      if (landmarkAuthorName == null) {
        throw new IllegalArgumentException("Argument \"landmarkAuthorName\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("landmarkAuthorName", landmarkAuthorName);
    } else {
      throw new IllegalArgumentException("Required argument \"landmarkAuthorName\" is missing and does not have an android:defaultValue");
    }
    return __result;
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
  public String getLandmarkAuthorName() {
    return (String) arguments.get("landmarkAuthorName");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
    if (arguments.containsKey("landmarkAuthorName")) {
      String landmarkAuthorName = (String) arguments.get("landmarkAuthorName");
      __result.putString("landmarkAuthorName", landmarkAuthorName);
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
    LandmarkFragmentArgs that = (LandmarkFragmentArgs) object;
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
    if (arguments.containsKey("landmarkAuthorName") != that.arguments.containsKey("landmarkAuthorName")) {
      return false;
    }
    if (getLandmarkAuthorName() != null ? !getLandmarkAuthorName().equals(that.getLandmarkAuthorName()) : that.getLandmarkAuthorName() != null) {
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
    result = 31 * result + (getLandmarkAuthorName() != null ? getLandmarkAuthorName().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "LandmarkFragmentArgs{"
        + "landmarkTitle=" + getLandmarkTitle()
        + ", landmarkDescription=" + getLandmarkDescription()
        + ", landmarkRating=" + getLandmarkRating()
        + ", landmarkId=" + getLandmarkId()
        + ", landmarkAuthorId=" + getLandmarkAuthorId()
        + ", landmarkAuthorName=" + getLandmarkAuthorName()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(LandmarkFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull String landmarkTitle, @NonNull String landmarkDescription,
        float landmarkRating, @NonNull String landmarkId, @NonNull String landmarkAuthorId,
        @NonNull String landmarkAuthorName) {
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
      if (landmarkAuthorName == null) {
        throw new IllegalArgumentException("Argument \"landmarkAuthorName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("landmarkAuthorName", landmarkAuthorName);
    }

    @NonNull
    public LandmarkFragmentArgs build() {
      LandmarkFragmentArgs result = new LandmarkFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setLandmarkTitle(@NonNull String landmarkTitle) {
      if (landmarkTitle == null) {
        throw new IllegalArgumentException("Argument \"landmarkTitle\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("landmarkTitle", landmarkTitle);
      return this;
    }

    @NonNull
    public Builder setLandmarkDescription(@NonNull String landmarkDescription) {
      if (landmarkDescription == null) {
        throw new IllegalArgumentException("Argument \"landmarkDescription\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("landmarkDescription", landmarkDescription);
      return this;
    }

    @NonNull
    public Builder setLandmarkRating(float landmarkRating) {
      this.arguments.put("landmarkRating", landmarkRating);
      return this;
    }

    @NonNull
    public Builder setLandmarkId(@NonNull String landmarkId) {
      if (landmarkId == null) {
        throw new IllegalArgumentException("Argument \"landmarkId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("landmarkId", landmarkId);
      return this;
    }

    @NonNull
    public Builder setLandmarkAuthorId(@NonNull String landmarkAuthorId) {
      if (landmarkAuthorId == null) {
        throw new IllegalArgumentException("Argument \"landmarkAuthorId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("landmarkAuthorId", landmarkAuthorId);
      return this;
    }

    @NonNull
    public Builder setLandmarkAuthorName(@NonNull String landmarkAuthorName) {
      if (landmarkAuthorName == null) {
        throw new IllegalArgumentException("Argument \"landmarkAuthorName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("landmarkAuthorName", landmarkAuthorName);
      return this;
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
    public String getLandmarkAuthorName() {
      return (String) arguments.get("landmarkAuthorName");
    }
  }
}
