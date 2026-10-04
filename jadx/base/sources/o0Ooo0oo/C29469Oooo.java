package o0Ooo0oo;

import com.nimbusds.jose.shaded.json.parser.JSONParser;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.p609vo.PenVO;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Ooo0oo.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$initSecondaryViews$1$1$1", m80623f = "PenBarChildFragment.kt", m80624l = {957, JSONParser.MODE_JSON_SIMPLE, 963, 966, 969, 976}, m80625m = "invokeSuspend")
public final class C29469Oooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PenVO f104545OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104546OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ PenBarChildFragment f104547OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29469Oooo(PenVO penVO, PenBarChildFragment penBarChildFragment, Continuation<? super C29469Oooo> continuation) {
        super(2, continuation);
        this.f104545OooOo = penVO;
        this.f104547OooOoO0 = penBarChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29469Oooo(this.f104545OooOo, this.f104547OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29469Oooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r7 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r7 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r7 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (r7 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (r7 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
    
        if (r7.OooOOO(r3, true, r6) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104546OooOo0o;
        PenVO penVO = this.f104545OooOo;
        PenBarChildFragment penBarChildFragment = this.f104547OooOoO0;
        switch (i) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                switch (penVO.getType()) {
                    case 7:
                        this.f104546OooOo0o = 1;
                        obj = PenBarChildFragment.OooOoo0(penBarChildFragment, 3, this);
                        break;
                    case 8:
                        this.f104546OooOo0o = 2;
                        obj = PenBarChildFragment.OooOoo0(penBarChildFragment, 4, this);
                        break;
                    case 9:
                    default:
                        zBooleanValue = false;
                        if (!zBooleanValue) {
                            int i2 = PenBarChildFragment.f75240o0000OOo;
                            com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                            this.f104546OooOo0o = 6;
                            AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = com.orion.notein.p607ui.noteeditor.penbar.OooO0O0.f75139oo000o;
                            break;
                        }
                        return C32460OooOooO.f116667OooO00o;
                    case 10:
                        this.f104546OooOo0o = 4;
                        obj = PenBarChildFragment.OooOoo0(penBarChildFragment, 16, this);
                        break;
                    case 11:
                        this.f104546OooOo0o = 3;
                        obj = PenBarChildFragment.OooOoo0(penBarChildFragment, 13, this);
                        break;
                    case 12:
                        this.f104546OooOo0o = 5;
                        obj = PenBarChildFragment.OooOoo0(penBarChildFragment, 47, this);
                        break;
                }
                break;
            case 1:
                C32446OooOOOo.OooO0O0(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (!zBooleanValue) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 2:
                C32446OooOOOo.OooO0O0(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (!zBooleanValue) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 3:
                C32446OooOOOo.OooO0O0(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (!zBooleanValue) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 4:
                C32446OooOOOo.OooO0O0(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (!zBooleanValue) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 5:
                C32446OooOOOo.OooO0O0(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (!zBooleanValue) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 6:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
