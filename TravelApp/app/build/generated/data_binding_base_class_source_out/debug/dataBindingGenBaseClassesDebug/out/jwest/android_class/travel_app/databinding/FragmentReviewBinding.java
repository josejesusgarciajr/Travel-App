// Generated by data binding compiler. Do not edit!
package jwest.android_class.travel_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import jwest.android_class.travel_app.R;

public abstract class FragmentReviewBinding extends ViewDataBinding {
  @NonNull
  public final ProgressBar backgroundProgressbar;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final TextView numberOfCalories;

  @NonNull
  public final Button s;

  @NonNull
  public final EditText score;

  @NonNull
  public final ProgressBar statsProgressbar;

  @NonNull
  public final Button t;

  @NonNull
  public final TextView textView;

  @NonNull
  public final EditText total;

  protected FragmentReviewBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ProgressBar backgroundProgressbar, ConstraintLayout constraintLayout,
      TextView numberOfCalories, Button s, EditText score, ProgressBar statsProgressbar, Button t,
      TextView textView, EditText total) {
    super(_bindingComponent, _root, _localFieldCount);
    this.backgroundProgressbar = backgroundProgressbar;
    this.constraintLayout = constraintLayout;
    this.numberOfCalories = numberOfCalories;
    this.s = s;
    this.score = score;
    this.statsProgressbar = statsProgressbar;
    this.t = t;
    this.textView = textView;
    this.total = total;
  }

  @NonNull
  public static FragmentReviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_review, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentReviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentReviewBinding>inflateInternal(inflater, R.layout.fragment_review, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentReviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_review, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentReviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentReviewBinding>inflateInternal(inflater, R.layout.fragment_review, null, false, component);
  }

  public static FragmentReviewBinding bind(@NonNull View view) {
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
  public static FragmentReviewBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentReviewBinding)bind(component, view, R.layout.fragment_review);
  }
}
