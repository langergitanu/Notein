package o00Oo000;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.OooOOO0;
import o0000OOo.C24217OooO0O0;
import o0OOo0Oo.EnumC27285OooO;
import o0OOo0o0.InterfaceC27605OooO00o;
import o0OOo0oo.C27623OooOOO;
import o0OOo0oo.C27625OooOOOO;
import o0OOo0oo.C27629OooOOoo;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33952OooOo00;
import oO0oO00.C33975OoooOO0;
import oO0oO00.C33988OoooooO;
import oO0oO00.InterfaceC33999o00oO0o;
import oO0oO00.oo000o;
import oOo000Oo.C34428OooOOo;
import oOoo0.InterfaceC34595OooO0Oo;
import oOoo0.InterfaceC34606OooOOOo;

/* JADX INFO: renamed from: o00Oo000.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25035OooO0O0 implements InterfaceC33999o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f85013OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f85014OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f85015OooO0OO;

    public C25035OooO0O0(String str, String str2) {
        this.f85013OooO00o = 0;
        this.f85014OooO0O0 = str;
        this.f85015OooO0OO = str2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // oO0oO00.InterfaceC33999o00oO0o
    public Object OooO00o(InterfaceC34595OooO0Oo interfaceC34595OooO0Oo, ArrayList arrayList) {
        Object objOooO00o;
        Object obj = ((C33952OooOo00) this.f85015OooO0OO).get(C24217OooO0O0.OooO0Oo(interfaceC34595OooO0Oo));
        OooOOO0.OooO0o(obj, "get(...)");
        C33988OoooooO c33988OoooooO = (C33988OoooooO) obj;
        Object oo000oVar = c33988OoooooO.f122219OooO00o.get();
        if (oo000oVar == null) {
            synchronized (c33988OoooooO) {
                oo000oVar = c33988OoooooO.f122219OooO00o.get();
                if (oo000oVar == null) {
                    oo000oVar = new oo000o();
                    c33988OoooooO.f122219OooO00o = new SoftReference<>(oo000oVar);
                }
            }
        }
        oo000o oo000oVar2 = (oo000o) oo000oVar;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C33975OoooOO0((InterfaceC34606OooOOOo) it.next()));
        }
        ConcurrentHashMap<List<C33975OoooOO0>, C32445OooOOOO<InterfaceC33911OooO0OO<T>>> concurrentHashMap = oo000oVar2.f122291OooO00o;
        Object obj2 = concurrentHashMap.get(arrayList2);
        if (obj2 == null) {
            try {
                objOooO00o = (InterfaceC33911OooO0OO) ((InterfaceC32508OooOOOo) this.f85014OooO0O0).invoke(interfaceC34595OooO0Oo, arrayList);
            } catch (Throwable th) {
                objOooO00o = C32446OooOOOo.OooO00o(th);
            }
            C32445OooOOOO c32445OooOOOO = new C32445OooOOOO(objOooO00o);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, (C32445OooOOOO<InterfaceC33911OooO0OO<T>>) c32445OooOOOO);
            obj2 = objPutIfAbsent == null ? c32445OooOOOO : objPutIfAbsent;
        }
        return ((C32445OooOOOO) obj2).f116639OooOo0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object OooO0O0(EnumC27285OooO enumC27285OooO, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27623OooOOO c27623OooOOO;
        if (abstractC32479OooO0OO instanceof C27623OooOOO) {
            c27623OooOOO = (C27623OooOOO) abstractC32479OooO0OO;
            int i = c27623OooOOO.f97138OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27623OooOOO.f97138OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27623OooOOO = new C27623OooOOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c27623OooOOO.f97137OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27623OooOOO.f97138OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C27625OooOOOO c27625OooOOOO = new C27625OooOOOO(this, enumC27285OooO, null);
            c27623OooOOO.f97138OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c27625OooOOOO, c27623OooOOO);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        return ((C32445OooOOOO) objOooO0o).f116639OooOo0o;
    }

    public String toString() {
        switch (this.f85013OooO00o) {
            case 0:
                StringBuilder sb = new StringBuilder("<Letter envelop=");
                sb.append((String) this.f85014OooO0O0);
                sb.append(" body=");
                return androidx.concurrent.futures.OooO00o.OooO0OO(sb, (String) this.f85015OooO0OO, ">");
            default:
                return super.toString();
        }
    }

    public C25035OooO0O0(InterfaceC27605OooO00o repo, C27629OooOOoo c27629OooOOoo) {
        this.f85013OooO00o = 1;
        OooOOO0.OooO0oO(repo, "repo");
        this.f85014OooO0O0 = repo;
        this.f85015OooO0OO = c27629OooOOoo;
    }

    public C25035OooO0O0(InterfaceC32508OooOOOo interfaceC32508OooOOOo) {
        this.f85013OooO00o = 2;
        this.f85014OooO0O0 = interfaceC32508OooOOOo;
        this.f85015OooO0OO = new C33952OooOo00();
    }
}
