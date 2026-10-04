package o0o00o;

import android.os.Bundle;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbox.popup.listener.LassoFilterChangedListener$onLassoTypeChanged$1", m80623f = "LassoFilterChangedListener.kt", m80624l = {30}, m80625m = "invokeSuspend")
public final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f106209OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f106210OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C29926OooO0oO f106211OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Bundle f106212OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(Bundle bundle, C29926OooO0oO c29926OooO0oO, Continuation<? super OooO0o> continuation) {
        super(2, continuation);
        this.f106212OooOoO0 = bundle;
        this.f106211OooOoO = c29926OooO0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0o(this.f106212OooOoO0, this.f106211OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.internal.OooOO0o, oO0O000o.OooOOOo] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        String string;
        String str;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f106209OooOo;
        C29926OooO0oO c29926OooO0oO = this.f106211OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            string = this.f106212OooOoO0.getString(C18437z2.f56754h);
            if (string == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            if (string.equals(DrawToolFactory.LASSO_TYPE_CAPTURE)) {
                ?? r1 = c29926OooO0oO.f106222OooO0OO;
                Integer num = new Integer(11);
                this.f106210OooOo0o = string;
                this.f106209OooOo = 1;
                Object objInvoke = r1.invoke(num, this);
                if (objInvoke == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                str = string;
                obj = objInvoke;
            }
            c29926OooO0oO.f106220OooO00o.OooOOO0(string);
            return C32460OooOooO.f116667OooO00o;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = this.f106210OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        if (((Boolean) obj).booleanValue()) {
            return C32460OooOooO.f116667OooO00o;
        }
        string = str;
        c29926OooO0oO.f106220OooO00o.OooOOO0(string);
        return C32460OooOooO.f116667OooO00o;
    }
}
