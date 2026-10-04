package o0OO0oO0;

import android.content.Context;
import com.orion.notein.App;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0000o0O.OooOO0;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24334OooO0O0;
import o00o00O0.C25252OooO0Oo;
import o0Oo0O00.C28051OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0oOo.InterfaceC33895OooO00o;

/* JADX INFO: renamed from: o0OO0oO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.device.DeviceManager$getDeviceId$2", m80623f = "DeviceManager.kt", m80624l = {26, 28, 66, 40}, m80625m = "invokeSuspend")
public final class C26939OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f93577OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f93578OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Context f93579OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public InterfaceC33895OooO00o f93580OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f93581OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ Context f93582OooOoo0;

    /* JADX INFO: renamed from: o0OO0oO0.OooO0Oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.device.DeviceManager$getDeviceId$2$1$1$1", m80623f = "DeviceManager.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ String f93583OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f93584OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f93583OooOo = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f93583OooOo, continuation);
            oooO00o.f93584OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f93584OooOo0o;
            AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = App.f69543OooOoo0;
            c24334OooO0O0.OooO0oO(App.f69545OooOooo, this.f93583OooOo);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26939OooO0Oo(Context context, Continuation<? super C26939OooO0Oo> continuation) {
        super(2, continuation);
        this.f93582OooOoo0 = context;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26939OooO0Oo(this.f93582OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C26939OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
    
        if (r4.length() == 0) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001d, B:43:0x00d4, B:29:0x0092, B:31:0x009c, B:33:0x00a2, B:35:0x00aa, B:38:0x00b8, B:37:0x00b0), top: B:48:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001d, B:43:0x00d4, B:29:0x0092, B:31:0x009c, B:33:0x00a2, B:35:0x00aa, B:38:0x00b8, B:37:0x00b0), top: B:48:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [oO0o0oOo.OooO00o] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v9, types: [oO0o0oOo.OooO00o] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC24338OooO0o0 abstractC24338OooO0o0;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        AbstractC24338OooO0o0 abstractC24338OooO0o02;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        String str;
        String string;
        OooOO0<AbstractC24338OooO0o0> oooOO0OooO0O0;
        OooO00o oooO00o;
        String str2;
        InterfaceC33895OooO00o interfaceC33895OooO00o3;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r1 = this.f93581OooOoOO;
        Context context = this.f93582OooOoo0;
        try {
            if (r1 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = C28051OooO00o.OooO0O0(context).getData();
                this.f93581OooOoOO = 1;
                obj = C25252OooO0Oo.OooOOo(data, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (r1 != 1) {
                if (r1 == 2) {
                    AbstractC24338OooO0o0 abstractC24338OooO0o03 = (AbstractC24338OooO0o0) this.f93578OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    abstractC24338OooO0o0 = abstractC24338OooO0o03;
                    AbstractC24338OooO0o0 abstractC24338OooO0o04 = (AbstractC24338OooO0o0) obj;
                    interfaceC33895OooO00o = (InterfaceC33895OooO00o) OooO0o.f93586OooO0O0.getValue();
                    this.f93578OooOo0o = abstractC24338OooO0o0;
                    this.f93577OooOo = abstractC24338OooO0o04;
                    this.f93580OooOoO0 = interfaceC33895OooO00o;
                    this.f93579OooOoO = context;
                    this.f93581OooOoOO = 3;
                    if (interfaceC33895OooO00o.OooO00o(this) != enumC32485OooO00o) {
                        abstractC24338OooO0o02 = abstractC24338OooO0o04;
                        interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                        AbstractC24338OooO0o0.OooO00o<String> oooO00o2 = App.f69545OooOooo;
                        str = (String) abstractC24338OooO0o0.OooO0OO(oooO00o2);
                        if (str != null) {
                        }
                        string = (String) abstractC24338OooO0o02.OooO0OO(oooO00o2);
                        if (string != null) {
                            string = UUID.randomUUID().toString();
                            oooOO0OooO0O0 = C28051OooO00o.OooO0O0(context);
                            oooO00o = new OooO00o(string, null);
                            this.f93578OooOo0o = interfaceC33895OooO00o2;
                            this.f93577OooOo = string;
                            this.f93580OooOoO0 = null;
                            this.f93579OooOoO = null;
                            this.f93581OooOoOO = 4;
                            if (C24332OooO.OooO00o(oooOO0OooO0O0, oooO00o, this) != enumC32485OooO00o) {
                            }
                        }
                        OooOOO0.OooO0Oo(str);
                        return str;
                    }
                    return enumC32485OooO00o;
                }
                if (r1 != 3) {
                    if (r1 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) this.f93577OooOo;
                    InterfaceC33895OooO00o interfaceC33895OooO00o4 = (InterfaceC33895OooO00o) this.f93578OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    interfaceC33895OooO00o3 = interfaceC33895OooO00o4;
                    str = str2;
                    r1 = interfaceC33895OooO00o3;
                    OooOOO0.OooO0Oo(str);
                    return str;
                }
                context = this.f93579OooOoO;
                InterfaceC33895OooO00o interfaceC33895OooO00o5 = this.f93580OooOoO0;
                abstractC24338OooO0o02 = (AbstractC24338OooO0o0) this.f93577OooOo;
                abstractC24338OooO0o0 = (AbstractC24338OooO0o0) this.f93578OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33895OooO00o2 = interfaceC33895OooO00o5;
                AbstractC24338OooO0o0.OooO00o<String> oooO00o22 = App.f69545OooOooo;
                str = (String) abstractC24338OooO0o0.OooO0OO(oooO00o22);
                if (str != null) {
                    r1 = interfaceC33895OooO00o2;
                }
                string = (String) abstractC24338OooO0o02.OooO0OO(oooO00o22);
                if (string != null || string.length() == 0) {
                    string = UUID.randomUUID().toString();
                }
                oooOO0OooO0O0 = C28051OooO00o.OooO0O0(context);
                oooO00o = new OooO00o(string, null);
                this.f93578OooOo0o = interfaceC33895OooO00o2;
                this.f93577OooOo = string;
                this.f93580OooOoO0 = null;
                this.f93579OooOoO = null;
                this.f93581OooOoOO = 4;
                if (C24332OooO.OooO00o(oooOO0OooO0O0, oooO00o, this) != enumC32485OooO00o) {
                    str2 = string;
                    interfaceC33895OooO00o3 = interfaceC33895OooO00o2;
                    str = str2;
                    r1 = interfaceC33895OooO00o3;
                    OooOOO0.OooO0Oo(str);
                    return str;
                }
                return enumC32485OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            AbstractC24338OooO0o0 abstractC24338OooO0o05 = (AbstractC24338OooO0o0) obj;
            InterfaceC33721OooO0o<AbstractC24338OooO0o0> data2 = C28051OooO00o.OooO00o(context).getData();
            this.f93578OooOo0o = abstractC24338OooO0o05;
            this.f93581OooOoOO = 2;
            Object objOooOOo = C25252OooO0Oo.OooOOo(data2, this);
            if (objOooOOo != enumC32485OooO00o) {
                abstractC24338OooO0o0 = abstractC24338OooO0o05;
                obj = objOooOOo;
                AbstractC24338OooO0o0 abstractC24338OooO0o042 = (AbstractC24338OooO0o0) obj;
                interfaceC33895OooO00o = (InterfaceC33895OooO00o) OooO0o.f93586OooO0O0.getValue();
                this.f93578OooOo0o = abstractC24338OooO0o0;
                this.f93577OooOo = abstractC24338OooO0o042;
                this.f93580OooOoO0 = interfaceC33895OooO00o;
                this.f93579OooOoO = context;
                this.f93581OooOoOO = 3;
                if (interfaceC33895OooO00o.OooO00o(this) != enumC32485OooO00o) {
                }
            }
            return enumC32485OooO00o;
        } finally {
            r1.OooOOO0(null);
        }
    }
}
