package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashMap;
import o0000oo.C24343OooO00o;
import o0000oo.C24348OooO0o0;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends ConstraintHelper {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f63864Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f63865Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public C24343OooO00o f63866Oooo00o;

    public Barrier(Context context) {
        super(context);
        this.f63868OooOo0o = new int[32];
        this.f63871OooOoOO = false;
        this.f63874OooOooO = null;
        this.f63875OooOooo = new HashMap<>();
        this.f63870OooOoO0 = context;
        OooO(null);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooO(AttributeSet attributeSet) {
        super.OooO(attributeSet);
        this.f63866Oooo00o = new C24343OooO00o();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, OooO0o.f64131OooO0O0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f63866Oooo00o.f81934o0ooOO0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f63866Oooo00o.f81935o0ooOOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f63869OooOoO = this.f63866Oooo00o;
        OooOOO0();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOO0(C24348OooO0o0 c24348OooO0o0, boolean z) {
        int i = this.f63864Oooo000;
        this.f63865Oooo00O = i;
        if (z) {
            if (i == 5) {
                this.f63865Oooo00O = 1;
            } else if (i == 6) {
                this.f63865Oooo00O = 0;
            }
        } else if (i == 5) {
            this.f63865Oooo00O = 0;
        } else if (i == 6) {
            this.f63865Oooo00O = 1;
        }
        if (c24348OooO0o0 instanceof C24343OooO00o) {
            ((C24343OooO00o) c24348OooO0o0).f81933o00oO0O = this.f63865Oooo00O;
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f63866Oooo00o.f81934o0ooOO0;
    }

    public int getMargin() {
        return this.f63866Oooo00o.f81935o0ooOOo;
    }

    public int getType() {
        return this.f63864Oooo000;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f63866Oooo00o.f81934o0ooOO0 = z;
    }

    public void setDpMargin(int i) {
        this.f63866Oooo00o.f81935o0ooOOo = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f63866Oooo00o.f81935o0ooOOo = i;
    }

    public void setType(int i) {
        this.f63864Oooo000 = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
