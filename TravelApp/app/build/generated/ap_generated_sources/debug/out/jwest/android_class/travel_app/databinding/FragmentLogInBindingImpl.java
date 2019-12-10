package jwest.android_class.travel_app.databinding;
import jwest.android_class.travel_app.R;
import jwest.android_class.travel_app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLogInBindingImpl extends FragmentLogInBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView2, 1);
        sViewsWithIds.put(R.id.username_TEXTVIEW, 2);
        sViewsWithIds.put(R.id.userName, 3);
        sViewsWithIds.put(R.id.password_TEXTVIEW, 4);
        sViewsWithIds.put(R.id.password, 5);
        sViewsWithIds.put(R.id.logInButton, 6);
        sViewsWithIds.put(R.id.registrationBtn, 7);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentLogInBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentLogInBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.Button) bindings[6]
            , (android.widget.EditText) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.Button) bindings[7]
            , (android.widget.TextView) bindings[1]
            , (android.widget.EditText) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.logIn.setTag(null);
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
        if (BR.LogInFragment == variableId) {
            setLogInFragment((jwest.android_class.travel_app.Log_In) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLogInFragment(@Nullable jwest.android_class.travel_app.Log_In LogInFragment) {
        this.mLogInFragment = LogInFragment;
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
        flag 0 (0x1L): LogInFragment
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}