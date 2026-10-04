package o0OO00o0;

import com.orion.notein.data.p602db.entity.TextBoxEntity;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34981o0O00OoO;

/* JADX INFO: renamed from: o0OO00o0.o00o0O0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.TextBoxLocalDataSource$createTextBoxes$2", m80623f = "TextBoxLocalDataSource.kt", m80624l = {32, 34}, m80625m = "invokeSuspend")
public final class C26666o00o0O0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34981o0O00OoO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f92027OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92028OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ ArrayList f92029OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f92030OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26666o00o0O0O(boolean z, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f92030OooOoO0 = z;
        this.f92029OooOoO = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26666o00o0O0O c26666o00o0O0O = new C26666o00o0O0O(this.f92030OooOoO0, this.f92029OooOoO, continuation);
        c26666o00o0O0O.f92027OooOo = obj;
        return c26666o00o0O0O;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34981o0O00OoO abstractC34981o0O00OoO, Continuation<? super C32460OooOooO> continuation) {
        return ((C26666o00o0O0O) create(abstractC34981o0O00OoO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r7.OooO(r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (r7.OooO0oo(r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        return r0;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92028OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC34981o0O00OoO abstractC34981o0O00OoO = (AbstractC34981o0O00OoO) this.f92027OooOo;
            ArrayList arrayList = this.f92029OooOoO;
            if (this.f92030OooOoO0) {
                TextBoxEntity[] textBoxEntityArr = (TextBoxEntity[]) arrayList.toArray(new TextBoxEntity[0]);
                TextBoxEntity[] textBoxEntityArr2 = (TextBoxEntity[]) Arrays.copyOf(textBoxEntityArr, textBoxEntityArr.length);
                this.f92028OooOo0o = 1;
            } else {
                TextBoxEntity[] textBoxEntityArr3 = (TextBoxEntity[]) arrayList.toArray(new TextBoxEntity[0]);
                TextBoxEntity[] textBoxEntityArr4 = (TextBoxEntity[]) Arrays.copyOf(textBoxEntityArr3, textBoxEntityArr3.length);
                this.f92028OooOo0o = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
