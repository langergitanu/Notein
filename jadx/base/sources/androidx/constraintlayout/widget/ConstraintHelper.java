package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import o0000oo.C24342OooO;
import o0000oo.C24348OooO0o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f63867OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int[] f63868OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C24342OooO f63869OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Context f63870OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f63871OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public String f63872OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public String f63873OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View[] f63874OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public HashMap<Integer, String> f63875OooOooo;

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f63868OooOo0o = new int[32];
        this.f63871OooOoOO = false;
        this.f63874OooOooO = null;
        this.f63875OooOooo = new HashMap<>();
        this.f63870OooOoO0 = context;
        OooO(attributeSet);
    }

    public void OooO(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, OooO0o.f64131OooO0O0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f63873OooOoo0 = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f63872OooOoo = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void OooO00o(String str) {
        Context context;
        if (str == null || str.length() == 0 || (context = this.f63870OooOoO0) == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int identifier = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, strTrim);
            if (designInformation instanceof Integer) {
                identifier = ((Integer) designInformation).intValue();
            }
        }
        if (identifier == 0 && constraintLayout != null) {
            identifier = OooO0oO(constraintLayout, strTrim);
        }
        if (identifier == 0) {
            try {
                identifier = C21626OooO0o0.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
        }
        if (identifier != 0) {
            this.f63875OooOooo.put(Integer.valueOf(identifier), strTrim);
            OooO0O0(identifier);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    public final void OooO0O0(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f63867OooOo + 1;
        int[] iArr = this.f63868OooOo0o;
        if (i2 > iArr.length) {
            this.f63868OooOo0o = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f63868OooOo0o;
        int i3 = this.f63867OooOo;
        iArr2[i3] = i;
        this.f63867OooOo = i3 + 1;
    }

    public final void OooO0OO(String str) {
        if (str == null || str.length() == 0 || this.f63870OooOoO0 == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.OooO00o) && strTrim.equals(((ConstraintLayout.OooO00o) layoutParams).f63925OoooOo0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    OooO0O0(childAt.getId());
                }
            }
        }
    }

    public final void OooO0Oo() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        OooO0o0((ConstraintLayout) parent);
    }

    public void OooO0o(ConstraintLayout constraintLayout) {
    }

    public final void OooO0o0(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f63867OooOo; i++) {
            View viewById = constraintLayout.getViewById(this.f63868OooOo0o[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int OooO0oO(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f63870OooOoO0.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public final View[] OooO0oo(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f63874OooOooO;
        if (viewArr == null || viewArr.length != this.f63867OooOo) {
            this.f63874OooOooO = new View[this.f63867OooOo];
        }
        for (int i = 0; i < this.f63867OooOo; i++) {
            this.f63874OooOooO[i] = constraintLayout.getViewById(this.f63868OooOo0o[i]);
        }
        return this.f63874OooOooO;
    }

    public void OooOO0(C24348OooO0o0 c24348OooO0o0, boolean z) {
    }

    public void OooOO0O() {
    }

    public void OooOO0o(ConstraintLayout constraintLayout) {
    }

    public final void OooOOO0() {
        if (this.f63869OooOoO == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.OooO00o) {
            ((ConstraintLayout.OooO00o) layoutParams).f63942o00ooo = this.f63869OooOoO;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f63868OooOo0o, this.f63867OooOo);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f63873OooOoo0;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f63872OooOoo;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f63871OooOoOO) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setIds(String str) {
        this.f63873OooOoo0 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f63867OooOo = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                OooO00o(str.substring(i));
                return;
            } else {
                OooO00o(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f63872OooOoo = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f63867OooOo = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                OooO0OO(str.substring(i));
                return;
            } else {
                OooO0OO(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f63873OooOoo0 = null;
        this.f63867OooOo = 0;
        for (int i : iArr) {
            OooO0O0(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f63873OooOoo0 == null) {
            OooO0O0(i);
        }
    }
}
