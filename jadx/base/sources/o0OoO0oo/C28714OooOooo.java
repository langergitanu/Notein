package o0OoO0oo;

import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
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

/* JADX INFO: renamed from: o0OoO0oo.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.LockNoteFragment$lockNoteIfReachLimit$1", m80623f = "LockNoteFragment.kt", m80624l = {120, 123, 125}, m80625m = "invokeSuspend")
public final class C28714OooOooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Iterator f101731OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public LockNoteFragment f101732OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ ArrayList f101733OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f101734OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ LockNoteFragment f101735OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C28947o00oO0o f101736OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28714OooOooo(ArrayList arrayList, LockNoteFragment lockNoteFragment, C28947o00oO0o c28947o00oO0o, Continuation continuation) {
        super(2, continuation);
        this.f101733OooOoO = arrayList;
        this.f101735OooOoOO = lockNoteFragment;
        this.f101736OooOoo0 = c28947o00oO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28714OooOooo(this.f101733OooOoO, this.f101735OooOoOO, this.f101736OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28714OooOooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        if (r12.OooO0o(r11) == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d A[PHI: r1 r7
      0x003d: PHI (r1v3 java.util.Iterator) = (r1v2 java.util.Iterator), (r1v4 java.util.Iterator) binds: [B:15:0x0037, B:22:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r7v1 com.orion.notein.ui.noteeditor.LockNoteFragment) = (r7v0 com.orion.notein.ui.noteeditor.LockNoteFragment), (r7v2 com.orion.notein.ui.noteeditor.LockNoteFragment) binds: [B:15:0x0037, B:22:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0060 -> B:21:0x0063). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Iterator it;
        LockNoteFragment lockNoteFragment;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101734OooOoO0;
        LockNoteFragment lockNoteFragment2 = this.f101735OooOoOO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ArrayList arrayList = this.f101733OooOoO;
            if (!arrayList.isEmpty()) {
                it = arrayList.iterator();
                lockNoteFragment = lockNoteFragment2;
                if (it.hasNext()) {
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                this.f101736OooOoo0.invoke();
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
                C28729OoooO0O c28729OoooO0OOooOoOO = lockNoteFragment2.OooOoOO();
                this.f101734OooOoO0 = 3;
            }
            return C32460OooOooO.f116667OooO00o;
        }
        it = this.f101731OooOo;
        lockNoteFragment = this.f101732OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        if (((Boolean) obj).booleanValue()) {
            if (it.hasNext()) {
                String str = (String) it.next();
                C28729OoooO0O c28729OoooO0OOooOoOO2 = lockNoteFragment.OooOoOO();
                this.f101732OooOo0o = lockNoteFragment;
                this.f101731OooOo = it;
                this.f101734OooOoO0 = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28722Oooo0o(c28729OoooO0OOooOoOO2, str, null), this);
                if (obj != enumC32485OooO00o) {
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        C28729OoooO0O c28729OoooO0OOooOoOO3 = lockNoteFragment2.OooOoOO();
        this.f101732OooOo0o = null;
        this.f101731OooOo = null;
        this.f101734OooOoO0 = 2;
        obj = c28729OoooO0OOooOoOO3.f101773OooO0Oo.OooO0Oo(this);
        if (obj != enumC32485OooO00o) {
            if (((Boolean) obj).booleanValue()) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
        return enumC32485OooO00o;
    }
}
