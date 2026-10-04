package OooOoo;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import o00Ooo.C25084OooOOoo;
import o00Ooo.InterfaceC25074OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32484OooO0oo;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", m80623f = "DragGestureDetector.kt", m80624l = {811, 828}, m80625m = "invokeSuspend")
public final class OooOOOO extends AbstractC32484OooO0oo implements InterfaceC32508OooOOOo<InterfaceC25074OooO0OO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f58929OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public o00Ooo.OooOOO0 f58930OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f58931OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f58932OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C24034Oooo00O<o00Ooo.OooOo00> f58933OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C24034Oooo00O<o00Ooo.OooOo00> f58934OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(C24034Oooo00O<o00Ooo.OooOo00> c24034Oooo00O, C24034Oooo00O<o00Ooo.OooOo00> c24034Oooo00O2, Continuation<? super OooOOOO> continuation) {
        super(2, continuation);
        this.f58933OooOoOO = c24034Oooo00O;
        this.f58934OooOoo0 = c24034Oooo00O2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooOOOO oooOOOO = new OooOOOO(this.f58933OooOoOO, this.f58934OooOoo0, continuation);
        oooOOOO.f58931OooOoO = obj;
        return oooOOOO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC25074OooO0OO interfaceC25074OooO0OO, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOOOO) create(interfaceC25074OooO0OO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3 A[EDGE_INSN: B:66:0x00c3->B:41:0x00c3 BREAK  A[LOOP:0: B:36:0x00b0->B:40:0x00c0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v11, types: [T, o00Ooo.OooOo00] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a4 -> B:35:0x00a7). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC25074OooO0OO interfaceC25074OooO0OO;
        int i;
        Object objO00o0O;
        int size;
        int i2;
        int size2;
        int i3;
        Object objO00o0O2;
        T t;
        o00Ooo.OooOo00 oooOo00;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = this.f58932OooOoO0;
        int i5 = 1;
        int i6 = 2;
        o00Ooo.OooOOO0 oooOOO0 = null;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC25074OooO0OO = (InterfaceC25074OooO0OO) this.f58931OooOoO;
            i = 0;
            if (i != 0) {
            }
        } else {
            if (i4 == 1) {
                i = this.f58929OooOo;
                interfaceC25074OooO0OO = (InterfaceC25074OooO0OO) this.f58931OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                objO00o0O = obj;
                o00Ooo.OooOOO0 oooOOO02 = (o00Ooo.OooOOO0) objO00o0O;
                List<o00Ooo.OooOo00> list = oooOOO02.f85127OooO00o;
                size = list.size();
                i2 = 0;
                while (true) {
                    if (i2 >= size) {
                    }
                    i2++;
                }
                List<o00Ooo.OooOo00> list2 = oooOOO02.f85127OooO00o;
                size2 = list2.size();
                while (i3 < size2) {
                }
                o00Ooo.OooOOOO oooOOOO = o00Ooo.OooOOOO.f85132OooOoO0;
                this.f58931OooOoO = interfaceC25074OooO0OO;
                this.f58930OooOo0o = oooOOO02;
                this.f58929OooOo = i;
                this.f58932OooOoO0 = i6;
                objO00o0O2 = interfaceC25074OooO0OO.o00o0O(oooOOOO, this);
                if (objO00o0O2 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.f58929OooOo;
            o00Ooo.OooOOO0 oooOOO03 = this.f58930OooOo0o;
            InterfaceC25074OooO0OO interfaceC25074OooO0OO2 = (InterfaceC25074OooO0OO) this.f58931OooOoO;
            C32446OooOOOo.OooO0O0(obj);
            objO00o0O2 = obj;
            List<o00Ooo.OooOo00> list3 = ((o00Ooo.OooOOO0) objO00o0O2).f85127OooO00o;
            int size3 = list3.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size3) {
                    break;
                }
                if (list3.get(i7).OooO0O0()) {
                    i = i5;
                    break;
                }
                i7++;
            }
            C24034Oooo00O<o00Ooo.OooOo00> c24034Oooo00O = this.f58933OooOoOO;
            boolean zOooO0Oo = C20601OooOO0o.OooO0Oo(oooOOO03, c24034Oooo00O.f80942OooOo0o.f85144OooO00o);
            C24034Oooo00O<o00Ooo.OooOo00> c24034Oooo00O2 = this.f58934OooOoo0;
            List<o00Ooo.OooOo00> list4 = oooOOO03.f85127OooO00o;
            if (!zOooO0Oo) {
                int size4 = list4.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size4) {
                        oooOo00 = null;
                        break;
                    }
                    oooOo00 = list4.get(i8);
                    if (oooOo00.f85147OooO0Oo) {
                        break;
                    }
                    i8++;
                }
                o00Ooo.OooOo00 oooOo002 = oooOo00;
                if (oooOo002 == 0) {
                    i = i5;
                    interfaceC25074OooO0OO = interfaceC25074OooO0OO2;
                    oooOOO0 = null;
                    if (i != 0) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    o00Ooo.OooOOOO oooOOOO2 = o00Ooo.OooOOOO.f85129OooOo;
                    this.f58931OooOoO = interfaceC25074OooO0OO;
                    this.f58930OooOo0o = oooOOO0;
                    this.f58929OooOo = i;
                    this.f58932OooOoO0 = i5;
                    objO00o0O = interfaceC25074OooO0OO.o00o0O(oooOOOO2, this);
                    if (objO00o0O != enumC32485OooO00o) {
                        o00Ooo.OooOOO0 oooOOO022 = (o00Ooo.OooOOO0) objO00o0O;
                        List<o00Ooo.OooOo00> list5 = oooOOO022.f85127OooO00o;
                        size = list5.size();
                        i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                i = i5;
                                break;
                            }
                            if (!o00Ooo.OooOOO.OooO0O0(list5.get(i2))) {
                                break;
                            }
                            i2++;
                        }
                        List<o00Ooo.OooOo00> list22 = oooOOO022.f85127OooO00o;
                        size2 = list22.size();
                        for (i3 = 0; i3 < size2; i3++) {
                            o00Ooo.OooOo00 oooOo003 = list22.get(i3);
                            if (oooOo003.OooO0O0() || o00Ooo.OooOOO.OooO0o0(oooOo003, interfaceC25074OooO0OO.OooO00o(), interfaceC25074OooO0OO.OoooooO())) {
                                break;
                            }
                        }
                        o00Ooo.OooOOOO oooOOOO3 = o00Ooo.OooOOOO.f85132OooOoO0;
                        this.f58931OooOoO = interfaceC25074OooO0OO;
                        this.f58930OooOo0o = oooOOO022;
                        this.f58929OooOo = i;
                        this.f58932OooOoO0 = i6;
                        objO00o0O2 = interfaceC25074OooO0OO.o00o0O(oooOOOO3, this);
                        if (objO00o0O2 != enumC32485OooO00o) {
                            interfaceC25074OooO0OO2 = interfaceC25074OooO0OO;
                            oooOOO03 = oooOOO022;
                            List<o00Ooo.OooOo00> list32 = ((o00Ooo.OooOOO0) objO00o0O2).f85127OooO00o;
                            int size32 = list32.size();
                            int i72 = 0;
                            while (true) {
                                if (i72 >= size32) {
                                }
                                i72++;
                            }
                            C24034Oooo00O<o00Ooo.OooOo00> c24034Oooo00O3 = this.f58933OooOoOO;
                            boolean zOooO0Oo2 = C20601OooOO0o.OooO0Oo(oooOOO03, c24034Oooo00O3.f80942OooOo0o.f85144OooO00o);
                            C24034Oooo00O<o00Ooo.OooOo00> c24034Oooo00O22 = this.f58934OooOoo0;
                            List<o00Ooo.OooOo00> list42 = oooOOO03.f85127OooO00o;
                            if (!zOooO0Oo2) {
                                int size5 = list42.size();
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= size5) {
                                        t = 0;
                                        break;
                                    }
                                    t = list42.get(i9);
                                    if (C25084OooOOoo.OooO00o(((o00Ooo.OooOo00) t).f85144OooO00o, c24034Oooo00O3.f80942OooOo0o.f85144OooO00o)) {
                                        break;
                                    }
                                    i9++;
                                }
                                c24034Oooo00O22.f80942OooOo0o = t;
                            }
                        }
                    }
                    return enumC32485OooO00o;
                }
                c24034Oooo00O3.f80942OooOo0o = oooOo002;
                c24034Oooo00O22.f80942OooOo0o = oooOo002;
            }
            interfaceC25074OooO0OO = interfaceC25074OooO0OO2;
            i5 = 1;
            i6 = 2;
            oooOOO0 = null;
            if (i != 0) {
            }
        }
    }
}
