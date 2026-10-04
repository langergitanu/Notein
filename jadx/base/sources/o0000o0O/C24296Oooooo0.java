package o0000o0O;

import java.io.File;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import o0000o0O.C24296Oooooo0;
import o00ooO0.C25749OooOoO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33651OoooOoO;
import oO0o0OOo.InterfaceC33712OooOo0O;

/* JADX INFO: renamed from: o0000o0O.Oooooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", m80623f = "MulticastFileObserver.android.kt", m80624l = {84, 85}, m80625m = "invokeSuspend")
public final class C24296Oooooo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33712OooOo0O<? super C32460OooOooO>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f81767OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C24294OooooOo f81768OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ File f81769OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f81770OooOoO0;

    /* JADX INFO: renamed from: o0000o0O.Oooooo0$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33651OoooOoO f81771OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(InterfaceC33651OoooOoO interfaceC33651OoooOoO) {
            super(0);
            this.f81771OooOo0o = interfaceC33651OoooOoO;
        }

        @Override // oO0O000o.OooO00o
        public final C32460OooOooO invoke() {
            this.f81771OooOo0o.dispose();
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0000o0O.Oooooo0$OooO0O0 */
    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<String, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33712OooOo0O<C32460OooOooO> f81772OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ File f81773OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(File file, InterfaceC33712OooOo0O<? super C32460OooOooO> interfaceC33712OooOo0O) {
            super(1);
            this.f81773OooOo0o = file;
            this.f81772OooOo = interfaceC33712OooOo0O;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(String str) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, this.f81773OooOo0o.getName())) {
                C25749OooOoO0.OooO0o0(this.f81772OooOo, C32460OooOooO.f116667OooO00o);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24296Oooooo0(File file, Continuation<? super C24296Oooooo0> continuation) {
        super(2, continuation);
        this.f81769OooOoO = file;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C24296Oooooo0 c24296Oooooo0 = new C24296Oooooo0(this.f81769OooOoO, continuation);
        c24296Oooooo0.f81770OooOoO0 = obj;
        return c24296Oooooo0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33712OooOo0O<? super C32460OooOooO> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
        return ((C24296Oooooo0) create(interfaceC33712OooOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
    
        if (oO0o0OOo.C33711OooOo00.OooO00o(r3, r9, r8) == r0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [oO0o0OO.OoooOoO] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r5v1, types: [o0000o0O.OooooOo] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33712OooOo0O interfaceC33712OooOo0O;
        ?? r1;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f81767OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33712OooOo0O interfaceC33712OooOo0O2 = (InterfaceC33712OooOo0O) this.f81770OooOoO0;
            final OooO0O0 oooO0O0 = new OooO0O0(this.f81769OooOoO, interfaceC33712OooOo0O2);
            Object obj2 = FileObserverC24295Oooooo.f81764OooO0O0;
            File parentFile = this.f81769OooOoO.getParentFile();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(parentFile);
            final String key = parentFile.getCanonicalFile().getPath();
            synchronized (FileObserverC24295Oooooo.f81764OooO0O0) {
                try {
                    LinkedHashMap linkedHashMap = FileObserverC24295Oooooo.f81765OooO0OO;
                    kotlin.jvm.internal.OooOOO0.OooO0o(key, "key");
                    Object fileObserverC24295Oooooo = linkedHashMap.get(key);
                    if (fileObserverC24295Oooooo == null) {
                        fileObserverC24295Oooooo = new FileObserverC24295Oooooo(key);
                        linkedHashMap.put(key, fileObserverC24295Oooooo);
                    }
                    FileObserverC24295Oooooo fileObserverC24295Oooooo2 = (FileObserverC24295Oooooo) fileObserverC24295Oooooo;
                    fileObserverC24295Oooooo2.f81766OooO00o.add(oooO0O0);
                    if (fileObserverC24295Oooooo2.f81766OooO00o.size() == 1) {
                        fileObserverC24295Oooooo2.startWatching();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ?? r5 = new InterfaceC33651OoooOoO() { // from class: o0000o0O.OooooOo
                @Override // oO0o0OO.InterfaceC33651OoooOoO
                public final void dispose() {
                    String str = key;
                    C24296Oooooo0.OooO0O0 oooO0O02 = oooO0O0;
                    synchronized (FileObserverC24295Oooooo.f81764OooO0O0) {
                        try {
                            LinkedHashMap linkedHashMap2 = FileObserverC24295Oooooo.f81765OooO0OO;
                            FileObserverC24295Oooooo fileObserverC24295Oooooo3 = (FileObserverC24295Oooooo) linkedHashMap2.get(str);
                            if (fileObserverC24295Oooooo3 != null) {
                                fileObserverC24295Oooooo3.f81766OooO00o.remove(oooO0O02);
                                if (fileObserverC24295Oooooo3.f81766OooO00o.isEmpty()) {
                                    linkedHashMap2.remove(str);
                                    fileObserverC24295Oooooo3.stopWatching();
                                }
                            }
                            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            };
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            this.f81770OooOoO0 = interfaceC33712OooOo0O2;
            this.f81768OooOo0o = r5;
            this.f81767OooOo = 1;
            if (interfaceC33712OooOo0O2.OooOOO(c32460OooOooO, this) != enumC32485OooO00o) {
                interfaceC33712OooOo0O = interfaceC33712OooOo0O2;
                r1 = r5;
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
        C24294OooooOo c24294OooooOo = this.f81768OooOo0o;
        interfaceC33712OooOo0O = (InterfaceC33712OooOo0O) this.f81770OooOoO0;
        C32446OooOOOo.OooO0O0(obj);
        r1 = c24294OooooOo;
        OooO00o oooO00o = new OooO00o(r1);
        this.f81770OooOoO0 = null;
        this.f81768OooOo0o = null;
        this.f81767OooOo = 2;
    }
}
