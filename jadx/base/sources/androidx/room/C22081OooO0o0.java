package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.OooO00o;
import androidx.room.OooO0O0;
import androidx.room.OooO0OO;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32463OooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33595OooOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOo.EnumC33692OooO0OO;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33773Oooooo;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34449Oooo0oo;
import oOo000Oo.OooOOO;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: androidx.room.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22081OooO0o0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO0O0 f66201OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f66202OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final androidx.room.OooO0OO f66203OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Context f66204OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC33636Oooo00o f66205OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f66206OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicBoolean f66207OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public androidx.room.OooO0O0 f66208OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C33772OooooOo f66209OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooO00o f66210OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooO0OO f66211OooOO0O;

    /* JADX INFO: renamed from: androidx.room.OooO0o0$OooO00o */
    public static final class OooO00o extends OooO00o.AbstractBinderC19035OooO00o {

        /* JADX INFO: renamed from: androidx.room.OooO0o0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1", m80623f = "MultiInstanceInvalidationClient.android.kt", m80624l = {87}, m80625m = "invokeSuspend")
        public static final class C19038OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f66213OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public Set f66214OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ C22081OooO0o0 f66215OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ String[] f66216OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19038OooO00o(String[] strArr, C22081OooO0o0 c22081OooO0o0, Continuation<? super C19038OooO00o> continuation) {
                super(2, continuation);
                this.f66216OooOoO0 = strArr;
                this.f66215OooOoO = c22081OooO0o0;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19038OooO00o(this.f66216OooOoO0, this.f66215OooOoO, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19038OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                Set<String> tables;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f66213OooOo;
                C22081OooO0o0 c22081OooO0o0 = this.f66215OooOoO;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    String[] strArr = this.f66216OooOoO0;
                    Object[] elements = Arrays.copyOf(strArr, strArr.length);
                    OooOOO0.OooO0oO(elements, "elements");
                    Set setOoooOo0 = OooOOO.OoooOo0(elements);
                    C33772OooooOo c33772OooooOo = c22081OooO0o0.f66209OooO0oo;
                    this.f66214OooOo0o = setOoooOo0;
                    this.f66213OooOo = 1;
                    if (c33772OooooOo.emit(setOoooOo0, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    tables = setOoooOo0;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tables = this.f66214OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                }
                androidx.room.OooO0OO oooO0OO = c22081OooO0o0.f66203OooO0O0;
                OooOOO0.OooO0oO(tables, "tables");
                ReentrantLock reentrantLock = oooO0OO.f66187OooO0o0;
                reentrantLock.lock();
                try {
                    List<OooO0o> listO0ooOO0 = OooOo.o0ooOO0(oooO0OO.f66185OooO0Oo.values());
                    reentrantLock.unlock();
                    for (OooO0o oooO0o : listO0ooOO0) {
                        OooO0OO.OooO00o oooO00o = oooO0o.f66197OooO00o;
                        oooO00o.getClass();
                        if (!(oooO00o instanceof OooO0O0)) {
                            String[] strArr2 = oooO0o.f66199OooO0OO;
                            int length = strArr2.length;
                            Set<String> setOooO0Oo = C34438OooOoo0.f123458OooOo0o;
                            if (length != 0) {
                                if (length != 1) {
                                    C32463OooO c32463OooO = new C32463OooO();
                                    for (String str : tables) {
                                        int length2 = strArr2.length;
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 < length2) {
                                                String str2 = strArr2[i2];
                                                if (C33595OooOOo.OooOOo(str2, str, true)) {
                                                    c32463OooO.add(str2);
                                                    break;
                                                }
                                                i2++;
                                            }
                                        }
                                    }
                                    setOooO0Oo = C34449Oooo0oo.OooO0Oo(c32463OooO);
                                } else {
                                    Set set = tables;
                                    if (!(set instanceof Collection) || !set.isEmpty()) {
                                        Iterator it = set.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            if (C33595OooOOo.OooOOo((String) it.next(), strArr2[0], true)) {
                                                setOooO0Oo = oooO0o.f66200OooO0Oo;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            if (!setOooO0Oo.isEmpty()) {
                                oooO0o.f66197OooO00o.OooO00o(setOooO0Oo);
                            }
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        }

        public OooO00o() {
            attachInterface(this, androidx.room.OooO00o.f66176OooO0OO);
        }

        @Override // androidx.room.OooO00o
        public final void OooO00o(String[] tables) {
            OooOOO0.OooO0oO(tables, "tables");
            C22081OooO0o0 c22081OooO0o0 = C22081OooO0o0.this;
            C33609OooO0oo.OooO0OO(c22081OooO0o0.f66205OooO0Oo, null, null, new C19038OooO00o(tables, c22081OooO0o0, null), 3);
        }
    }

    /* JADX INFO: renamed from: androidx.room.OooO0o0$OooO0O0 */
    public static final class OooO0O0 extends OooO0OO.OooO00o {
        public OooO0O0(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.OooO0OO.OooO00o
        public final void OooO00o(Set<String> tables) {
            OooOOO0.OooO0oO(tables, "tables");
            C22081OooO0o0 c22081OooO0o0 = C22081OooO0o0.this;
            if (c22081OooO0o0.f66207OooO0o0.get()) {
                return;
            }
            try {
                androidx.room.OooO0O0 oooO0O0 = c22081OooO0o0.f66208OooO0oO;
                if (oooO0O0 != null) {
                    oooO0O0.OooOOOo(c22081OooO0o0.f66206OooO0o, (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot broadcast invalidation", e);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.OooO0o0$OooO0OO */
    public static final class OooO0OO implements ServiceConnection {
        public OooO0OO() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName name, IBinder service) {
            androidx.room.OooO0O0 oooO0O0;
            OooOOO0.OooO0oO(name, "name");
            OooOOO0.OooO0oO(service, "service");
            int i = OooO0O0.OooO00o.f66179OooO0o0;
            IInterface iInterfaceQueryLocalInterface = service.queryLocalInterface(androidx.room.OooO0O0.f66178OooO0Oo);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof androidx.room.OooO0O0)) {
                OooO0O0.OooO00o.C19037OooO00o c19037OooO00o = new OooO0O0.OooO00o.C19037OooO00o();
                c19037OooO00o.f66180OooO0o0 = service;
                oooO0O0 = c19037OooO00o;
            } else {
                oooO0O0 = (androidx.room.OooO0O0) iInterfaceQueryLocalInterface;
            }
            C22081OooO0o0 c22081OooO0o0 = C22081OooO0o0.this;
            c22081OooO0o0.f66208OooO0oO = oooO0O0;
            try {
                c22081OooO0o0.f66206OooO0o = oooO0O0.OooOOo0(c22081OooO0o0.f66210OooOO0, c22081OooO0o0.f66202OooO00o);
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName name) {
            OooOOO0.OooO0oO(name, "name");
            C22081OooO0o0.this.f66208OooO0oO = null;
        }
    }

    public C22081OooO0o0(Context context, String name, androidx.room.OooO0OO oooO0OO) {
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(name, "name");
        this.f66202OooO00o = name;
        this.f66203OooO0O0 = oooO0OO;
        this.f66204OooO0OO = context.getApplicationContext();
        this.f66205OooO0Oo = oooO0OO.f66182OooO00o.OooO();
        this.f66207OooO0o0 = new AtomicBoolean(true);
        this.f66209OooO0oo = C33773Oooooo.OooO00o(0, 0, EnumC33692OooO0OO.f121452OooOo0o);
        this.f66201OooO = new OooO0O0(oooO0OO.f66183OooO0O0);
        this.f66210OooOO0 = new OooO00o();
        this.f66211OooOO0O = new OooO0OO();
    }
}
