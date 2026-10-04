package o00O0O00;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o00O0O00.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24830OooO0Oo extends OooOOOO implements InterfaceC32507OooOO0o<SidecarDisplayFeature, Boolean> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C24830OooO0Oo f84211OooOo0o = new C24830OooO0Oo(1);

    @Override // oO0O000o.InterfaceC32507OooOO0o
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        OooOOO0.OooO0oO(require, "$this$require");
        boolean z = true;
        if (require.getType() == 1 && require.getRect().width() != 0 && require.getRect().height() != 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
