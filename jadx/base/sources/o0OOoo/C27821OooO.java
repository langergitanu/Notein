package o0OOoo;

import android.graphics.Rect;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PaperSpec;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27585o00ooO0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OOoo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27821OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C27449o00O0OoO f98278OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27585o00ooO0 f98279OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Ooooo00.OooO f98280OooO0OO;

    public C27821OooO(C27449o00O0OoO c27449o00O0OoO, C27585o00ooO0 c27585o00ooO0, Ooooo00.OooO oooO) {
        this.f98278OooO00o = c27449o00O0OoO;
        this.f98279OooO0O0 = c27585o00ooO0;
        this.f98280OooO0OO = oooO;
    }

    public static final Page OooO00o(C27821OooO c27821OooO, Page page, Page page2) {
        c27821OooO.getClass();
        PaperSpec paperSpec = page2.getPaperSpec();
        Rect unrotatedPaperPadding = page2.getUnrotatedPaperPadding();
        return Page.copy$default(page, null, null, paperSpec, page2.getPaperOrientation(), page2.getPaperTheme(), page2.getPaddingStyle(), unrotatedPaperPadding, null, false, 0, 0L, 0L, null, null, 0, false, null, null, null, 524163, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27825OooO0Oo c27825OooO0Oo;
        if (abstractC32479OooO0OO instanceof C27825OooO0Oo) {
            c27825OooO0Oo = (C27825OooO0Oo) abstractC32479OooO0OO;
            int i = c27825OooO0Oo.f98297OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27825OooO0Oo.f98297OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27825OooO0Oo = new C27825OooO0Oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c27825OooO0Oo.f98296OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27825OooO0Oo.f98297OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C27827OooO0o0 c27827OooO0o0 = new C27827OooO0o0(this, str, null);
            c27825OooO0Oo.f98297OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c27827OooO0o0, c27825OooO0Oo);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        return ((C32445OooOOOO) objOooO0o).f116639OooOo0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27826OooO0o c27826OooO0o;
        if (abstractC32479OooO0OO instanceof C27826OooO0o) {
            c27826OooO0o = (C27826OooO0o) abstractC32479OooO0OO;
            int i = c27826OooO0o.f98300OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27826OooO0o.f98300OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27826OooO0o = new C27826OooO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c27826OooO0o.f98299OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27826OooO0o.f98300OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C27828OooO0oO c27828OooO0oO = new C27828OooO0oO(this, str2, str, null);
            c27826OooO0o.f98300OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c27828OooO0oO, c27826OooO0o);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        return ((C32445OooOOOO) objOooO0o).f116639OooOo0o;
    }
}
