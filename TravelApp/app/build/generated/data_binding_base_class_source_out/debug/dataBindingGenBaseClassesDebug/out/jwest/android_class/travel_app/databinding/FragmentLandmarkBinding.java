// Generated by data binding compiler. Do not edit!
package jwest.android_class.travel_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import jwest.android_class.travel_app.LandmarkFragment;
import jwest.android_class.travel_app.R;

public abstract class FragmentLandmarkBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout frameLayout;

  @NonNull
  public final TextView landmarkAuthorText;

  @NonNull
  public final ImageButton landmarkDeleteButton;

  @NonNull
  public final TextView landmarkDescriptionText;

  @NonNull
  public final ImageButton landmarkEditButton;

  @NonNull
  public final RatingBar landmarkRatingInput;

  @NonNull
  public final TextView landmarkTitleText;

  @NonNull
  public final ConstraintLayout linearLayout;

  @NonNull
  public final Button rateButton;

  @NonNull
  public final ScrollView scrollView2;

  @Bindable
  protected LandmarkFragment mLandmarkFragment;

  protected FragmentLandmarkBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout frameLayout, TextView landmarkAuthorText, ImageButton landmarkDeleteButton,
      TextView landmarkDescriptionText, ImageButton landmarkEditButton,
      RatingBar landmarkRatingInput, TextView landmarkTitleText, ConstraintLayout linearLayout,
      Button rateButton, ScrollView scrollView2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.frameLayout = frameLayout;
    this.landmarkAuthorText = landmarkAuthorText;
    this.landmarkDeleteButton = landmarkDeleteButton;
    this.landmarkDescriptionText = landmarkDescriptionText;
    this.landmarkEditButton = landmarkEditButton;
    this.landmarkRatingInput = landmarkRatingInput;
    this.landmarkTitleText = landmarkTitleText;
    this.linearLayout = linearLayout;
    this.rateButton = rateButton;
    this.scrollView2 = scrollView2;
  }

  public abstract void setLandmarkFragment(@Nullable LandmarkFragment landmarkFragment);

  @Nullable
  public LandmarkFragment getLandmarkFragment() {
    return mLandmarkFragment;
  }

  @NonNull
  public static FragmentLandmarkBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_landmark, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLandmarkBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentLandmarkBinding>inflateInternal(inflater, R.layout.fragment_landmark, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentLandmarkBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_landmark, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLandmarkBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentLandmarkBinding>inflateInternal(inflater, R.layout.fragment_landmark, null, false, component);
  }

  public static FragmentLandmarkBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentLandmarkBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentLandmarkBinding)bind(component, view, R.layout.fragment_landmark);
  }
}
