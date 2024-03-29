// Generated by data binding compiler. Do not edit!
package jwest.android_class.travel_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import jwest.android_class.travel_app.Log_In;
import jwest.android_class.travel_app.R;

public abstract class FragmentLogInBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout logIn;

  @NonNull
  public final Button logInButton;

  @NonNull
  public final EditText password;

  @NonNull
  public final TextView passwordTEXTVIEW;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final EditText userName;

  @NonNull
  public final TextView usernameTEXTVIEW;

  @Bindable
  protected Log_In mLogInFragment;

  protected FragmentLogInBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout logIn, Button logInButton, EditText password, TextView passwordTEXTVIEW,
      TextView textView2, EditText userName, TextView usernameTEXTVIEW) {
    super(_bindingComponent, _root, _localFieldCount);
    this.logIn = logIn;
    this.logInButton = logInButton;
    this.password = password;
    this.passwordTEXTVIEW = passwordTEXTVIEW;
    this.textView2 = textView2;
    this.userName = userName;
    this.usernameTEXTVIEW = usernameTEXTVIEW;
  }

  public abstract void setLogInFragment(@Nullable Log_In LogInFragment);

  @Nullable
  public Log_In getLogInFragment() {
    return mLogInFragment;
  }

  @NonNull
  public static FragmentLogInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_log__in, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLogInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentLogInBinding>inflateInternal(inflater, R.layout.fragment_log__in, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentLogInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_log__in, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLogInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentLogInBinding>inflateInternal(inflater, R.layout.fragment_log__in, null, false, component);
  }

  public static FragmentLogInBinding bind(@NonNull View view) {
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
  public static FragmentLogInBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentLogInBinding)bind(component, view, R.layout.fragment_log__in);
  }
}
