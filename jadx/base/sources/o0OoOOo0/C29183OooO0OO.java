package o0OoOOo0;

import kotlin.jvm.internal.OooOOO0;
import oO0OOOO.OooOO0O;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: renamed from: o0OoOOo0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29183OooO0OO extends oO0O00o0.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f103506OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f103507OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29183OooO0OO(int i, Object obj, Object obj2) {
        super(obj);
        this.f103506OooO00o = i;
        this.f103507OooO0O0 = obj2;
    }

    @Override // oO0O00o0.OooO00o
    public void afterChange(InterfaceC34602OooOO0o property, Object obj, Object obj2) {
        switch (this.f103506OooO00o) {
            case 0:
                OooOOO0.OooO0oO(property, "property");
                ((C29182OooO0O0) this.f103507OooO0O0).notifyDataSetChanged();
                break;
            default:
                super.afterChange(property, obj, obj2);
                break;
        }
    }

    @Override // oO0O00o0.OooO00o
    public boolean beforeChange(InterfaceC34602OooOO0o property, Object obj, Object obj2) {
        switch (this.f103506OooO00o) {
            case 1:
                OooOOO0.OooO0oO(property, "property");
                if (((OooOO0O) this.f103507OooO0O0).f118987OooO00o) {
                    throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
                }
                return true;
            default:
                return super.beforeChange(property, obj, obj2);
        }
    }
}
