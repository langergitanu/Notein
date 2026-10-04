package androidx.compose.p002ui.platform;

import Oooo0oO.C21051Oooo000;
import Oooo0oO.C21065OoooOOO;
import Oooo0oO.InterfaceC21033OooOOOO;
import Oooo0oO.o00000O0;
import OoooOo0.C21228OooO00o;
import android.view.View;
import com.orion.notein.global.R;
import java.util.Set;
import kotlin.jvm.internal.OooOOOO;
import o000oOoO.C24633OooO00o;
import o000oOoO.C24636OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0O00.InterfaceC32498OooO0o0;
import oO0O00.OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: androidx.compose.ui.platform.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21611OooO0oO extends OooOOOO implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24633OooO00o f63511OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C21612OooO0oo f63512OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21611OooO0oO(C21612OooO0oo c21612OooO0oo, C24633OooO00o c24633OooO00o) {
        super(2);
        this.f63512OooOo0o = c21612OooO0oo;
        this.f63511OooOo = c24633OooO00o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) {
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        if ((num.intValue() & 11) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
            interfaceC21033OooOOOO2.OooO0o();
        } else {
            C21612OooO0oo c21612OooO0oo = this.f63512OooOo0o;
            Object tag = c21612OooO0oo.f63514OooOo0o.getTag(R.id.inspection_slot_table_set);
            Set set = (tag instanceof Set) && (!(tag instanceof OooO00o) || (tag instanceof InterfaceC32498OooO0o0)) ? (Set) tag : null;
            AndroidComposeView androidComposeView = c21612OooO0oo.f63514OooOo0o;
            if (set == null) {
                Object parent = androidComposeView.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof OooO00o) && !(tag2 instanceof InterfaceC32498OooO0o0))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(interfaceC21033OooOOOO2.OooOo0O());
                interfaceC21033OooOOOO2.OooOOo();
            }
            C21065OoooOOO.OooO0O0(interfaceC21033OooOOOO2, androidComposeView, new C21610OooO0o0(c21612OooO0oo, null));
            C21051Oooo000.OooO00o(new o00000O0[]{C21228OooO00o.f61585OooO00o.OooO00o(set)}, C24636OooO0O0.OooO0O0(interfaceC21033OooOOOO2, -1193460702, new OooO0o(c21612OooO0oo, this.f63511OooOo)), interfaceC21033OooOOOO2, 56);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
