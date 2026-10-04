package o0OOO0OO;

import com.orion.notein.data.p602db.entity.PageEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34428OooOOo;
import oo0oO0.InterfaceC34887o00o00O0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.page.PageLocalDataSource$updateOldNoteId$2", m80623f = "PageLocalDataSource.kt", m80624l = {143, 146}, m80625m = "invokeSuspend")
public final class OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC34887o00o00O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f94019OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94020OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f94021OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f94022OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(String str, String str2, Continuation<? super OooOOOO> continuation) {
        super(2, continuation);
        this.f94022OooOoO0 = str;
        this.f94021OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooOOOO oooOOOO = new OooOOOO(this.f94022OooOoO0, this.f94021OooOoO, continuation);
        oooOOOO.f94019OooOo = obj;
        return oooOOOO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC34887o00o00O0 interfaceC34887o00o00O0, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOOOO) create(interfaceC34887o00o00O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009c, code lost:
    
        if (r2.OooO0oO(r4, r31) == r1) goto L19;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC34887o00o00O0 interfaceC34887o00o00O0;
        Object objOooO0O0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94020OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC34887o00o00O0 = (InterfaceC34887o00o00O0) this.f94019OooOo;
            this.f94019OooOo = interfaceC34887o00o00O0;
            this.f94020OooOo0o = 1;
            objOooO0O0 = interfaceC34887o00o00O0.OooO0O0(this.f94022OooOoO0, this);
            if (objOooO0O0 != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        interfaceC34887o00o00O0 = (InterfaceC34887o00o00O0) this.f94019OooOo;
        C32446OooOOOo.OooO0O0(obj);
        objOooO0O0 = obj;
        Iterable iterable = (Iterable) objOooO0O0;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(PageEntity.copy$default((PageEntity) it.next(), null, this.f94021OooOoO, null, null, null, 0, null, null, 0L, 0L, "", false, 0, null, null, 0, false, null, 0, 523261, null));
        }
        PageEntity[] pageEntityArr = (PageEntity[]) arrayList.toArray(new PageEntity[0]);
        PageEntity[] pageEntityArr2 = (PageEntity[]) Arrays.copyOf(pageEntityArr, pageEntityArr.length);
        this.f94019OooOo = null;
        this.f94020OooOo0o = 2;
    }
}
