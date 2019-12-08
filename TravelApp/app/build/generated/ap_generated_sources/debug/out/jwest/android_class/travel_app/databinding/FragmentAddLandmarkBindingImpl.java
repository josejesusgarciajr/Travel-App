package jwest.android_class.travel_app.databinding;
import jwest.android_class.travel_app.R;
import jwest.android_class.travel_app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddLandmarkBindingImpl extends FragmentAddLandmarkBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.landmarkTitleInput, 1);
        sViewsWithIds.put(R.id.landmarkDescriptionInput, 2);
        sViewsWithIds.put(R.id.textView6, 3);
        sViewsWithIds.put(R.id.textView7, 4);
        sViewsWithIds.put(R.id.addLandmarkSubmitButton, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAddLandmarkBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentAddLandmarkBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            );
        this.frameLayout2.setTag(null);
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
        if (BR.addLandmarkFragment == variableId) {
            setAddLandmarkFragment((jwest.android_class.travel_app.AddLandmarkFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAddLandmarkFragment(@Nullable jwest.android_class.travel_app.AddLandmarkFragment AddLandmarkFragment) {
        this.mAddLandmarkFragment = AddLandmarkFragment;
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
        flag 0 (0x1L): addLandmarkFragment
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}