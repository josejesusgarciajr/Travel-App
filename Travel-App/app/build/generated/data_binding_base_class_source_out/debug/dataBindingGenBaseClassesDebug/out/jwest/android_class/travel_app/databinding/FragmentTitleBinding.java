// Generated by data binding compiler. Do not edit!
package jwest.android_class.travel_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import jwest.android_class.travel_app.R;
import jwest.android_class.travel_app.TitleFragment;

public abstract class FragmentTitleBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout back;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final Button titleToMapButton;

  @Bindable
  protected TitleFragment mTitleFragment;

  protected FragmentTitleBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout back, TextView textView4, Button titleToMapButton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.back = back;
    this.textView4 = textView4;
    this.titleToMapButton = titleToMapButton;
  }

  public abstract void setTitleFragment(@Nullable TitleFragment titleFragment);

  @Nullable
  public TitleFragment getTitleFragment() {
    return mTitleFragment;
  }

  @NonNull
  public static FragmentTitleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_title, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTitleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentTitleBinding>inflateInternal(inflater, R.layout.fragment_title, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentTitleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_title, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTitleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentTitleBinding>inflateInternal(inflater, R.layout.fragment_title, null, false, component);
  }

  public static FragmentTitleBinding bind(@NonNull View view) {
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
  public static FragmentTitleBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentTitleBinding)bind(component, view, R.layout.fragment_title);
  }
}
