package o0Ooo0oo;

import android.os.Bundle;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.note.PenInfo;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0Ooo0oo.o0ooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$currentLassoType$1", m80623f = "PenBarViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29565o0ooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends PenInfo>, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f104878OooOo0o;

    public C29565o0ooOO0() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C29565o0ooOO0 c29565o0ooOO0 = new C29565o0ooOO0(2, continuation);
        c29565o0ooOO0.f104878OooOo0o = obj;
        return c29565o0ooOO0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(List<? extends PenInfo> list, Continuation<? super String> continuation) {
        return ((C29565o0ooOO0) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object next;
        Bundle extra;
        String string;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Iterator it = ((List) this.f104878OooOo0o).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((PenInfo) next).getType() == 4) {
                break;
            }
        }
        PenInfo penInfo = (PenInfo) next;
        return (penInfo == null || (extra = penInfo.getExtra()) == null || (string = extra.getString(C18437z2.f56754h, DrawToolFactory.LASSO_TYPE_FREE)) == null) ? DrawToolFactory.LASSO_TYPE_FREE : string;
    }
}
