package jwest.android_class.travel_app.databinding;
import jwest.android_class.travel_app.R;
import jwest.android_class.travel_app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLandmarkBindingImpl extends FragmentLandmarkBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.landmark_title_text, 1);
        sViewsWithIds.put(R.id.landmarkRatingInput, 2);
        sViewsWithIds.put(R.id.rate_button, 3);
        sViewsWithIds.put(R.id.scrollView2, 4);
        sViewsWithIds.put(R.id.linearLayout, 5);
        sViewsWithIds.put(R.id.landmark_description_text, 6);
        sViewsWithIds.put(R.id.landmarkDeleteButton, 7);
        sViewsWithIds.put(R.id.landmarkEditButton, 8);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentLandmarkBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentLandmarkBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageButton) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.ImageButton) bindings[8]
            , (android.widget.RatingBar) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (android.widget.Button) bindings[3]
            , (android.widget.ScrollView) bindings[4]
            );
        this.frameLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.landmarkFragment == variableId) {
            setLandmarkFragment((jwest.android_class.travel_app.LandmarkFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLandmarkFragment(@Nullable jwest.android_class.travel_app.LandmarkFragment LandmarkFragment) {
        this.mLandmarkFragment = LandmarkFragment;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): landmarkFragment
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}