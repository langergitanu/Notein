package androidx.fragment.app;

import OooOoo.C20593OooO0Oo;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import o000Oo0.OooO0O0;

/* JADX INFO: renamed from: androidx.fragment.app.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C21903OooOoo implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final FragmentManager f64996OooOo0o;

    /* JADX INFO: renamed from: androidx.fragment.app.OooOoo$OooO00o */
    public class OooO00o implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C21914Oooo0oO f64998OooOo0o;

        public OooO00o(C21914Oooo0oO c21914Oooo0oO) {
            this.f64998OooOo0o = c21914Oooo0oO;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            C21914Oooo0oO c21914Oooo0oO = this.f64998OooOo0o;
            c21914Oooo0oO.OooOO0O();
            AbstractC21925OoooOoO.OooO((ViewGroup) c21914Oooo0oO.f65046OooO0OO.mView.getParent(), LayoutInflaterFactory2C21903OooOoo.this.f64996OooOo0o).OooO0oo();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public LayoutInflaterFactory2C21903OooOoo(FragmentManager fragmentManager) {
        this.f64996OooOo0o = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        C21914Oooo0oO c21914Oooo0oOOooO0oO;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        FragmentManager fragmentManager = this.f64996OooOo0o;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, fragmentManager);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000O0O.OooO00o.f82377OooO00o);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = Fragment.class.isAssignableFrom(C21901OooOoO0.OooO0O0(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment fragmentOooOooO = resourceId != -1 ? fragmentManager.OooOooO(resourceId) : null;
                    if (fragmentOooOooO == null && string != null) {
                        fragmentOooOooO = fragmentManager.OooOooo(string);
                    }
                    if (fragmentOooOooO == null && id != -1) {
                        fragmentOooOooO = fragmentManager.OooOooO(id);
                    }
                    if (fragmentOooOooO == null) {
                        fragmentOooOooO = fragmentManager.Oooo0O0().OooO00o(context.getClassLoader(), attributeValue);
                        fragmentOooOooO.mFromLayout = true;
                        fragmentOooOooO.mFragmentId = resourceId != 0 ? resourceId : id;
                        fragmentOooOooO.mContainerId = id;
                        fragmentOooOooO.mTag = string;
                        fragmentOooOooO.mInLayout = true;
                        fragmentOooOooO.mFragmentManager = fragmentManager;
                        AbstractC21900OooOoO<?> abstractC21900OooOoO = fragmentManager.f64816OooOo;
                        fragmentOooOooO.mHost = abstractC21900OooOoO;
                        fragmentOooOooO.onInflate((Context) abstractC21900OooOoO.f64990OooOo, attributeSet, fragmentOooOooO.mSavedFragmentState);
                        c21914Oooo0oOOooO0oO = fragmentManager.OooO00o(fragmentOooOooO);
                        if (FragmentManager.Oooo0o(2)) {
                            Log.v("FragmentManager", "Fragment " + fragmentOooOooO + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (fragmentOooOooO.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        fragmentOooOooO.mInLayout = true;
                        fragmentOooOooO.mFragmentManager = fragmentManager;
                        AbstractC21900OooOoO<?> abstractC21900OooOoO2 = fragmentManager.f64816OooOo;
                        fragmentOooOooO.mHost = abstractC21900OooOoO2;
                        fragmentOooOooO.onInflate((Context) abstractC21900OooOoO2.f64990OooOo, attributeSet, fragmentOooOooO.mSavedFragmentState);
                        c21914Oooo0oOOooO0oO = fragmentManager.OooO0oO(fragmentOooOooO);
                        if (FragmentManager.Oooo0o(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + fragmentOooOooO + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    OooO0O0.C19620OooO0O0 c19620OooO0O0 = o000Oo0.OooO0O0.f82897OooO00o;
                    o000Oo0.OooO0O0.OooO0O0(new o000Oo0.OooO0OO(fragmentOooOooO, "Attempting to use <fragment> tag to add fragment " + fragmentOooOooO + " to container " + viewGroup));
                    o000Oo0.OooO0O0.OooO00o(fragmentOooOooO).getClass();
                    fragmentOooOooO.mContainer = viewGroup;
                    c21914Oooo0oOOooO0oO.OooOO0O();
                    c21914Oooo0oOOooO0oO.OooOO0();
                    View view2 = fragmentOooOooO.mView;
                    if (view2 == null) {
                        throw new IllegalStateException(C20593OooO0Oo.OooO0O0("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fragmentOooOooO.mView.getTag() == null) {
                        fragmentOooOooO.mView.setTag(string);
                    }
                    fragmentOooOooO.mView.addOnAttachStateChangeListener(new OooO00o(c21914Oooo0oOOooO0oO));
                    return fragmentOooOooO.mView;
                }
            }
        }
        return null;
    }
}
