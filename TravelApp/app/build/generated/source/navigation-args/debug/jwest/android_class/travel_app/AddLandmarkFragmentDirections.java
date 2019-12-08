package jwest.android_class.travel_app;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class AddLandmarkFragmentDirections {
  private AddLandmarkFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionAddLandmarkFragmentToMapFragment() {
    return new ActionOnlyNavDirections(R.id.action_addLandmarkFragment_to_mapFragment);
  }
}
