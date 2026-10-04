package o000o0O0;

import android.os.Bundle;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
import o000o0O0.C24572OooOO0o;
import o000o0O0.C24583OooOo0o;
import o00o0OOO.C25402OooO0o0;
import o0OoO0oo.C28819o000oOoo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0O.C33567OooO0o0;
import oO0o0O0O.C33576OooOOOo;
import oO0o0Oo.C33769Ooooo0o;

/* JADX INFO: loaded from: classes.dex */
public abstract class Oooo0<D extends C24583OooOo0o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C24572OooOO0o.OooO00o f83357OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f83358OooO0O0;

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface OooO00o {
        String value();
    }

    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C24589OooOooO, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f83359OooOo0o = new OooO0O0(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(C24589OooOooO c24589OooOooO) {
            C24589OooOooO navOptions = c24589OooOooO;
            kotlin.jvm.internal.OooOOO0.OooO0oO(navOptions, "$this$navOptions");
            navOptions.f83337OooO0O0 = true;
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public void OooO(OooOO0 popUpTo, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(popUpTo, "popUpTo");
        List list = (List) ((C33769Ooooo0o) OooO0O0().f83372OooO0o0).f121747OooOo0o.getValue();
        if (!list.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        OooOO0 oooOO02 = null;
        while (OooOO0()) {
            oooOO02 = (OooOO0) listIterator.previous();
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(oooOO02, popUpTo)) {
                break;
            }
        }
        if (oooOO02 != null) {
            OooO0O0().OooO0oo(oooOO02, z);
        }
    }

    public abstract D OooO00o();

    public final AbstractC24602Oooo0o0 OooO0O0() {
        C24572OooOO0o.OooO00o oooO00o = this.f83357OooO00o;
        if (oooO00o != null) {
            return oooO00o;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public C24583OooOo0o OooO0OO(C24583OooOo0o c24583OooOo0o, Bundle bundle, C24587OooOoo c24587OooOoo) {
        return c24583OooOo0o;
    }

    public void OooO0Oo(List list, C24587OooOoo c24587OooOoo) {
        C33567OooO0o0.OooO00o oooO00o = new C33567OooO0o0.OooO00o(C33576OooOOOo.OooOOO(C33576OooOOOo.OooOOoo(oOo000Oo.OooOo.OooOooo(list), new C24599Oooo0O0(this, c24587OooOoo)), new C28819o000oOoo(1)));
        while (oooO00o.hasNext()) {
            OooO0O0().OooO((OooOO0) oooO00o.next());
        }
    }

    public void OooO0o(OooOO0 oooOO02) {
        C24583OooOo0o c24583OooOo0o = oooOO02.f83189OooOo;
        if (c24583OooOo0o == null) {
            c24583OooOo0o = null;
        }
        if (c24583OooOo0o == null) {
            return;
        }
        OooO0OO(c24583OooOo0o, null, C25402OooO0o0.OooO00o(OooO0O0.f83359OooOo0o));
        OooO0O0().OooO0oO(oooOO02);
    }

    public void OooO0o0(C24572OooOO0o.OooO00o oooO00o) {
        this.f83357OooO00o = oooO00o;
        this.f83358OooO0O0 = true;
    }

    public void OooO0oO(Bundle bundle) {
    }

    public Bundle OooO0oo() {
        return null;
    }

    public boolean OooOO0() {
        return true;
    }
}
