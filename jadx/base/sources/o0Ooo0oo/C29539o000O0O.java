package o0Ooo0oo;

import com.orion.notein.p607ui.p609vo.PenColorVO;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27363OoooOOo;
import o0OOo0o.C27364OoooOo0;
import o0OOo0o.C27366OoooOoo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0Ooo0oo.o000O0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$toggleColorSetFavorite$2", m80623f = "PenBarViewModel.kt", m80624l = {820, 822}, m80625m = "invokeSuspend")
public final class C29539o000O0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Integer>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104785OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104786OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f104787OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29539o000O0O(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, String str, Continuation<? super C29539o000O0O> continuation) {
        super(2, continuation);
        this.f104785OooOo = oooO0O0;
        this.f104787OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29539o000O0O(this.f104785OooOo, this.f104787OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Integer> continuation) {
        return ((C29539o000O0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
    
        if (r12 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
    
        if (r12 == r0) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int iIntValue;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104786OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = this.f104785OooOo;
            boolean zBooleanValue = ((Boolean) oooO0O0.f75200o00Oo0.f121747OooOo0o.getValue()).booleanValue();
            Iterable iterable = (Iterable) oooO0O0.f75188OoooOoo.f121747OooOo0o.getValue();
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(new Integer(((PenColorVO) it.next()).getColor()));
            }
            C27366OoooOoo c27366OoooOoo = oooO0O0.f75140OooO;
            if (zBooleanValue) {
                this.f104786OooOo0o = 1;
                c27366OoooOoo.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27364OoooOo0(c27366OoooOoo, 0, arrayList, null), this);
            } else {
                this.f104786OooOo0o = 2;
                String str = this.f104787OooOoO0;
                c27366OoooOoo.getClass();
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27363OoooOOo(c27366OoooOoo, 0, str, arrayList, null), this);
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            iIntValue = ((Number) obj).intValue();
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            iIntValue = ((Number) obj).intValue();
        }
        return new Integer(iIntValue);
    }
}
