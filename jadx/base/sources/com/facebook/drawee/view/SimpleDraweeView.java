package com.facebook.drawee.view;

import OooOoo0.OooOo00;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import o00o.C25203OooO00o;
import o00o0oOo.C25461OooO0Oo;
import o00oO00o.AbstractC25478OooO0O0;
import o00oo000.C25645OooO0Oo;
import o00oo000.C25646OooO0o0;
import o00oo0O.C25654OooO0Oo;
import o00ooO.C25732OooO0O0;
import o00ooO0o.C25763OooO00o;
import o00ooO0o.C25764OooO0O0;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class SimpleDraweeView extends GenericDraweeView {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static C25646OooO0o0 f67245OooOooo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final AbstractC25478OooO0O0 f67246OooOooO;

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet);
        try {
            C25732OooO0O0.OooO00o();
            if (isInEditMode()) {
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                OooOo00.OooO0o0(f67245OooOooo, "SimpleDraweeView was not initialized!");
                this.f67246OooOooO = f67245OooOooo.get();
            }
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C25203OooO00o.f85804OooO0O0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(1)) {
                        OooO0OO(Uri.parse(typedArrayObtainStyledAttributes.getString(1)));
                    } else if (typedArrayObtainStyledAttributes.hasValue(0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1)) != -1) {
                        if (isInEditMode()) {
                            setImageResource(resourceId);
                        } else {
                            setActualImageResource(resourceId);
                        }
                    }
                    typedArrayObtainStyledAttributes.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
            }
            C25732OooO0O0.OooO00o();
        } catch (Throwable th2) {
            C25732OooO0O0.OooO00o();
            throw th2;
        }
    }

    public final void OooO0OO(Uri uri) {
        AbstractC25478OooO0O0 abstractC25478OooO0O0 = this.f67246OooOooO;
        abstractC25478OooO0O0.getClass();
        C25645OooO0Oo c25645OooO0Oo = (C25645OooO0Oo) abstractC25478OooO0O0;
        if (uri == null) {
            c25645OooO0Oo.f86842OooO00o = null;
        } else {
            C25764OooO0O0 c25764OooO0O0OooO0o = C25764OooO0O0.OooO0o(uri);
            c25764OooO0O0OooO0o.f87933OooO0Oo = C25654OooO0Oo.f87572OooO0OO;
            c25645OooO0Oo.f86842OooO00o = c25764OooO0O0OooO0o.OooO00o();
        }
        c25645OooO0Oo.f86845OooO0Oo = getController();
        setController(c25645OooO0Oo.OooO00o());
    }

    public AbstractC25478OooO0O0 getControllerBuilder() {
        return this.f67246OooOooO;
    }

    public void setActualImageResource(int i) {
        Uri uri = C25461OooO0Oo.f86761OooO00o;
        OooO0OO(new Uri.Builder().scheme("res").path(String.valueOf(i)).build());
    }

    public void setImageRequest(C25763OooO00o c25763OooO00o) {
        AbstractC25478OooO0O0 abstractC25478OooO0O0 = this.f67246OooOooO;
        abstractC25478OooO0O0.f86842OooO00o = c25763OooO00o;
        abstractC25478OooO0O0.f86845OooO0Oo = getController();
        setController(abstractC25478OooO0O0.OooO00o());
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        OooO0OO(uri);
    }

    public void setImageURI(String str) {
        OooO0OO(str != null ? Uri.parse(str) : null);
    }
}
