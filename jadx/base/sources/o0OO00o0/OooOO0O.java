package o0OO00o0;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.data.p602db.entity.CommentEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import o000oo0o.C24718OooOO0o;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34428OooOOo;
import oo0oO0.InterfaceC34739OoooOo0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.CommentLocalDataSource$updateOldNoteId$2", m80623f = "CommentLocalDataSource.kt", m80624l = {103, 106}, m80625m = "invokeSuspend")
public final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC34739OoooOo0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91003OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91004OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f91005OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f91006OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(String str, String str2, Continuation<? super OooOO0O> continuation) {
        super(2, continuation);
        this.f91006OooOoO0 = str;
        this.f91005OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooOO0O oooOO0O = new OooOO0O(this.f91006OooOoO0, this.f91005OooOoO, continuation);
        oooOO0O.f91003OooOo = obj;
        return oooOO0O;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC34739OoooOo0 interfaceC34739OoooOo0, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOO0O) create(interfaceC34739OoooOo0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        if (r2.OooOO0(r4, r20) == r1) goto L19;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC34739OoooOo0 interfaceC34739OoooOo0;
        Object objOooOOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91004OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC34739OoooOo0 = (InterfaceC34739OoooOo0) this.f91003OooOo;
            C24718OooOO0o c24718OooOO0oOooO0o0 = interfaceC34739OoooOo0.OooO0o0(this.f91006OooOoO0);
            this.f91003OooOo = interfaceC34739OoooOo0;
            this.f91004OooOo0o = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(c24718OooOO0oOooO0o0, this);
            if (objOooOOo != enumC32485OooO00o) {
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
        interfaceC34739OoooOo0 = (InterfaceC34739OoooOo0) this.f91003OooOo;
        C32446OooOOOo.OooO0O0(obj);
        objOooOOo = obj;
        Iterable iterable = (Iterable) objOooOOo;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(CommentEntity.copy$default((CommentEntity) it.next(), null, null, null, this.f91005OooOoO, null, 0L, 0L, null, StyleIdentifier.LIGHT_LIST_ACCENT_6, null));
        }
        CommentEntity[] commentEntityArr = (CommentEntity[]) arrayList.toArray(new CommentEntity[0]);
        CommentEntity[] commentEntityArr2 = (CommentEntity[]) Arrays.copyOf(commentEntityArr, commentEntityArr.length);
        this.f91003OooOo = null;
        this.f91004OooOo0o = 2;
    }
}
