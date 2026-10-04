package androidx.core.view;

import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.C24019OooOO0o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80613k = 3, m80614mv = {1, 8, 0}, m80616xi = 48)
public /* synthetic */ class ViewKt$ancestors$1 extends C24019OooOO0o implements InterfaceC32507OooOO0o<ViewParent, ViewParent> {
    public static final ViewKt$ancestors$1 INSTANCE = new ViewKt$ancestors$1();

    public ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final ViewParent invoke(ViewParent viewParent) {
        return viewParent.getParent();
    }
}
