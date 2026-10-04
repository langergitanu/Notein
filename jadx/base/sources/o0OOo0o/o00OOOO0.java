package o0OOo0o;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Iterator;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase", m80623f = "NoteUseCase.kt", m80624l = {CommonConstant.RETCODE.SIGN_IN_PARAMS_ERROR, 2006, 2014, 2019}, m80625m = "removePlaceholder")
public final class o00OOOO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String[] f96212OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27449o00O0OoO f96213OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Object f96214OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f96215OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public String f96216OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96217OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f96218OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f96219OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOO0(C27449o00O0OoO c27449o00O0OoO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f96217OooOoo = c27449o00O0OoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f96218OooOoo0 = obj;
        this.f96219OooOooO |= Integer.MIN_VALUE;
        return this.f96217OooOoo.Oooo0oO(null, this);
    }
}
