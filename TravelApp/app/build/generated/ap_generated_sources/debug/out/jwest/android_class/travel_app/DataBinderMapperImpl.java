package jwest.android_class.travel_app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jwest.android_class.travel_app.databinding.ActivityMainBindingImpl;
import jwest.android_class.travel_app.databinding.DialogWindowBindingImpl;
import jwest.android_class.travel_app.databinding.FragmentAddLandmarkBindingImpl;
import jwest.android_class.travel_app.databinding.FragmentLandmarkBindingImpl;
import jwest.android_class.travel_app.databinding.FragmentLogInBindingImpl;
import jwest.android_class.travel_app.databinding.FragmentMapBindingImpl;
import jwest.android_class.travel_app.databinding.FragmentReviewBindingImpl;
import jwest.android_class.travel_app.databinding.FragmentTitleBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_DIALOGWINDOW = 2;

  private static final int LAYOUT_FRAGMENTADDLANDMARK = 3;

  private static final int LAYOUT_FRAGMENTLANDMARK = 4;

  private static final int LAYOUT_FRAGMENTLOGIN = 5;

  private static final int LAYOUT_FRAGMENTMAP = 6;

  private static final int LAYOUT_FRAGMENTREVIEW = 7;

  private static final int LAYOUT_FRAGMENTTITLE = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(jwest.android_class.travel_app.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(jwest.android_class.travel_app.R.layout.dialog_window, LAYOUT_DIALOGWINDOW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(jwest.android_class.travel_app.R.layout.fragment_add_landmark, LAYOUT_FRAGMENTADDLANDMARK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(jwest.android_class.travel_app.R.layout.fragment_landmark, LAYOUT_FRAGMENTLANDMARK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(jwest.android_class.travel_app.R.layout.fragment_log__in, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(jwest.android_class.travel_app.R.layout.fragment_map, LAYOUT_FRAGMENTMAP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(jwest.android_class.travel_app.R.layout.fragment_review, LAYOUT_FRAGMENTREVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(jwest.android_class.travel_app.R.layout.fragment_title, LAYOUT_FRAGMENTTITLE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGWINDOW: {
          if ("layout/dialog_window_0".equals(tag)) {
            return new DialogWindowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_window is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTADDLANDMARK: {
          if ("layout/fragment_add_landmark_0".equals(tag)) {
            return new FragmentAddLandmarkBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_add_landmark is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLANDMARK: {
          if ("layout/fragment_landmark_0".equals(tag)) {
            return new FragmentLandmarkBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_landmark is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_log__in_0".equals(tag)) {
            return new FragmentLogInBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_log__in is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAP: {
          if ("layout/fragment_map_0".equals(tag)) {
            return new FragmentMapBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_map is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREVIEW: {
          if ("layout/fragment_review_0".equals(tag)) {
            return new FragmentReviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_review is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTITLE: {
          if ("layout/fragment_title_0".equals(tag)) {
            return new FragmentTitleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_title is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(8);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "addLandmarkFragment");
      sKeys.put(2, "landmarkFragment");
      sKeys.put(3, "window");
      sKeys.put(4, "mapFragment");
      sKeys.put(5, "titleFragment");
      sKeys.put(6, "LogInFragment");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/activity_main_0", jwest.android_class.travel_app.R.layout.activity_main);
      sKeys.put("layout/dialog_window_0", jwest.android_class.travel_app.R.layout.dialog_window);
      sKeys.put("layout/fragment_add_landmark_0", jwest.android_class.travel_app.R.layout.fragment_add_landmark);
      sKeys.put("layout/fragment_landmark_0", jwest.android_class.travel_app.R.layout.fragment_landmark);
      sKeys.put("layout/fragment_log__in_0", jwest.android_class.travel_app.R.layout.fragment_log__in);
      sKeys.put("layout/fragment_map_0", jwest.android_class.travel_app.R.layout.fragment_map);
      sKeys.put("layout/fragment_review_0", jwest.android_class.travel_app.R.layout.fragment_review);
      sKeys.put("layout/fragment_title_0", jwest.android_class.travel_app.R.layout.fragment_title);
    }
  }
}
