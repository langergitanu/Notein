package o0OOo0o;

import com.orion.notein.App;
import com.orion.notein.domain.models.backup.BackupFile;
import java.util.Iterator;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24340OooO0oo;
import o00Oo000.C25035OooO0O0;
import o0OO00o0.C26559o000Oooo;
import o0OO00o0.C26577o000oo0O;
import o0OOo0Oo.EnumC27285OooO;
import o0OOo0o0.InterfaceC27605OooO00o;
import o0OOo0oo.C27635OooOoO;
import o0OOooO0.EnumC27953o00000Oo;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes9.dex */
public final class o0O00o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C26577o000oo0O f96921OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27351Oooo0O0 f96922OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC27605OooO00o f96923OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C25035OooO0O0 f96924OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C27635OooOoO f96925OooO0o0;

    public o0O00o0(C26577o000oo0O c26577o000oo0O, C27351Oooo0O0 backupUseCase, InterfaceC27605OooO00o cloudSyncRepo, C25035OooO0O0 c25035OooO0O0, C27635OooOoO c27635OooOoO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(backupUseCase, "backupUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudSyncRepo, "cloudSyncRepo");
        this.f96921OooO00o = c26577o000oo0O;
        this.f96922OooO0O0 = backupUseCase;
        this.f96923OooO0OO = cloudSyncRepo;
        this.f96924OooO0Oo = c25035OooO0O0;
        this.f96925OooO0o0 = c27635OooOoO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r5 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(o0O00o0 o0o00o02, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27502o00Ooo0o c27502o00Ooo0o;
        o0o00o02.getClass();
        if (abstractC32479OooO0OO instanceof C27502o00Ooo0o) {
            c27502o00Ooo0o = (C27502o00Ooo0o) abstractC32479OooO0OO;
            int i = c27502o00Ooo0o.f96382OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27502o00Ooo0o.f96382OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27502o00Ooo0o = new C27502o00Ooo0o(o0o00o02, abstractC32479OooO0OO);
            }
        }
        Object obj = c27502o00Ooo0o.f96380OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27502o00Ooo0o.f96382OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            BackupFile.DiskVendor diskVendor = BackupFile.DiskVendor.None;
            c27502o00Ooo0o.f96381OooOo0o = o0o00o02;
            c27502o00Ooo0o.f96382OooOoO = 1;
            if (o0o00o02.f96922OooO0O0.OooOoO(diskVendor, c27502o00Ooo0o) != obj2) {
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        o0o00o02 = c27502o00Ooo0o.f96381OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C27351Oooo0O0 c27351Oooo0O0 = o0o00o02.f96922OooO0O0;
        c27502o00Ooo0o.f96381OooOo0o = null;
        c27502o00Ooo0o.f96382OooOoO = 2;
        c27351Oooo0O0.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27350Oooo00o(c27351Oooo0O0, 1, null), c27502o00Ooo0o);
        if (objOooO0o != obj2) {
            objOooO0o = C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (r7.OooO0OO(r8, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0O0(o0O00o0 o0o00o02, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27504o00OooO0 c27504o00OooO0;
        o0o00o02.getClass();
        if (abstractC32479OooO0OO instanceof C27504o00OooO0) {
            c27504o00OooO0 = (C27504o00OooO0) abstractC32479OooO0OO;
            int i = c27504o00OooO0.f96391OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27504o00OooO0.f96391OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27504o00OooO0 = new C27504o00OooO0(o0o00o02, abstractC32479OooO0OO);
            }
        }
        Object obj = c27504o00OooO0.f96389OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27504o00OooO0.f96391OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27504o00OooO0.f96390OooOo0o = o0o00o02;
            c27504o00OooO0.f96391OooOoO = 1;
            if (o0o00o02.f96924OooO0Oo.OooO0O0(null, c27504o00OooO0) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            o0o00o02 = c27504o00OooO0.f96390OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            ((C32445OooOOOO) obj).getClass();
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            o0o00o02 = c27504o00OooO0.f96390OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C27635OooOoO c27635OooOoO = o0o00o02.f96925OooO0o0;
            EnumC27953o00000Oo enumC27953o00000Oo = EnumC27953o00000Oo.f98990OooOo;
            c27504o00OooO0.f96390OooOo0o = null;
            c27504o00OooO0.f96391OooOoO = 3;
        }
        InterfaceC27605OooO00o interfaceC27605OooO00o = o0o00o02.f96923OooO0OO;
        EnumC27285OooO enumC27285OooO = EnumC27285OooO.f95076OooOo0o;
        c27504o00OooO0.f96390OooOo0o = o0o00o02;
        c27504o00OooO0.f96391OooOoO = 2;
        if (interfaceC27605OooO00o.Oooo0o0(enumC27285OooO, c27504o00OooO0) != enumC32485OooO00o) {
            C27635OooOoO c27635OooOoO2 = o0o00o02.f96925OooO0o0;
            EnumC27953o00000Oo enumC27953o00000Oo2 = EnumC27953o00000Oo.f98990OooOo;
            c27504o00OooO0.f96390OooOo0o = null;
            c27504o00OooO0.f96391OooOoO = 3;
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0131, code lost:
    
        if (r0.OooO00o(r2, r1) == r3) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0OO(o0O00o0 o0o00o02, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27503o00OooO c27503o00OooO;
        o0O00o0 o0o00o03;
        Iterator it;
        o0O00o0 o0o00o04;
        Iterator it2;
        Iterator it3;
        o0o00o02.getClass();
        if (abstractC32479OooO0OO instanceof C27503o00OooO) {
            c27503o00OooO = (C27503o00OooO) abstractC32479OooO0OO;
            int i = c27503o00OooO.f96388OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27503o00OooO.f96388OooOoOO = i - Integer.MIN_VALUE;
                o0o00o03 = o0o00o02;
            } else {
                o0o00o03 = o0o00o02;
                c27503o00OooO = new C27503o00OooO(o0o00o03, abstractC32479OooO0OO);
            }
        }
        Object obj = c27503o00OooO.f96387OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27503o00OooO.f96388OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            it = C34429OooOOo0.OooOO0o(App.f69570OooooOO, App.f69571OooooOo, App.f69573Oooooo0, App.f69566OoooOoo, App.f69604ooOO, App.f69587o00O0O, App.f69568Ooooo0o, App.f69603oo0o0Oo, App.f69585o000OOo, App.f69589o00Ooo, App.f69582o00000OO, App.f69590o00o0O, App.f69593o00ooo, App.f69602oo000o, App.f69591o00oO0O, App.f69592o00oO0o, App.f69599o0ooOO0, App.f69564OoooOo0, App.f69559OoooO00, App.f69546Oooo, App.f69578o000000O, App.f69562OoooOOO, App.f69563OoooOOo, App.f69586o000oOoO, App.f69561OoooOO0, App.f69567Ooooo00).iterator();
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    it2 = c27503o00OooO.f96384OooOo;
                    o0o00o04 = c27503o00OooO.f96385OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    while (it2.hasNext()) {
                        AbstractC24338OooO0o0.OooO00o oooO00o = (AbstractC24338OooO0o0.OooO00o) it2.next();
                        C26577o000oo0O c26577o000oo0O = o0o00o04.f96921OooO00o;
                        c27503o00OooO.f96385OooOo0o = o0o00o04;
                        c27503o00OooO.f96384OooOo = it2;
                        c27503o00OooO.f96388OooOoOO = 2;
                        if (c26577o000oo0O.OooO00o(oooO00o, c27503o00OooO) == enumC32485OooO00o) {
                            break;
                        }
                    }
                    it3 = C34429OooOOo0.OooOO0o(App.f69558OoooO0, App.f69588o00Oo0, App.f69579o000000o).iterator();
                    while (true) {
                        if (it3.hasNext()) {
                        }
                    }
                    return enumC32485OooO00o;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                it3 = c27503o00OooO.f96384OooOo;
                o0o00o04 = c27503o00OooO.f96385OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                while (true) {
                    if (it3.hasNext()) {
                        AbstractC24338OooO0o0.OooO00o oooO00o2 = (AbstractC24338OooO0o0.OooO00o) it3.next();
                        C26577o000oo0O c26577o000oo0O2 = o0o00o04.f96921OooO00o;
                        c27503o00OooO.f96385OooOo0o = o0o00o04;
                        c27503o00OooO.f96384OooOo = it3;
                        c27503o00OooO.f96388OooOoOO = 3;
                        if (c26577o000oo0O2.OooO00o(oooO00o2, c27503o00OooO) == enumC32485OooO00o) {
                            break;
                        }
                    } else {
                        C26577o000oo0O c26577o000oo0O3 = o0o00o04.f96921OooO00o;
                        AbstractC24338OooO0o0.OooO00o<String> oooO00o3 = App.f69576o00000;
                        c27503o00OooO.f96385OooOo0o = null;
                        c27503o00OooO.f96384OooOo = null;
                        c27503o00OooO.f96388OooOoOO = 4;
                    }
                }
                return enumC32485OooO00o;
            }
            Iterator it4 = c27503o00OooO.f96384OooOo;
            o0O00o0 o0o00o05 = c27503o00OooO.f96385OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            it = it4;
            o0o00o03 = o0o00o05;
        }
        while (it.hasNext()) {
            AbstractC24338OooO0o0.OooO00o oooO00o4 = (AbstractC24338OooO0o0.OooO00o) it.next();
            C26577o000oo0O c26577o000oo0O4 = o0o00o03.f96921OooO00o;
            c27503o00OooO.f96385OooOo0o = o0o00o03;
            c27503o00OooO.f96384OooOo = it;
            c27503o00OooO.f96388OooOoOO = 1;
            if (c26577o000oo0O4.OooO00o(oooO00o4, c27503o00OooO) == enumC32485OooO00o) {
                break;
            }
        }
        o0o00o04 = o0o00o03;
        it2 = C34429OooOOo0.OooOO0o(App.f69572Oooooo, App.f69565OoooOoO, App.f69569OooooO0, App.f69556Oooo0oo).iterator();
        while (it2.hasNext()) {
        }
        it3 = C34429OooOOo0.OooOO0o(App.f69558OoooO0, App.f69588o00Oo0, App.f69579o000000o).iterator();
        while (true) {
            if (it3.hasNext()) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0Oo(o0O00o0 o0o00o02, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27505o00OooOO c27505o00OooOO;
        o0O00o0 o0o00o03;
        Iterator it;
        o0o00o02.getClass();
        if (abstractC32479OooO0OO instanceof C27505o00OooOO) {
            c27505o00OooOO = (C27505o00OooOO) abstractC32479OooO0OO;
            int i = c27505o00OooOO.f96397OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27505o00OooOO.f96397OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27505o00OooOO = new C27505o00OooOO(o0o00o02, abstractC32479OooO0OO);
            }
        }
        Object obj = c27505o00OooOO.f96396OooOoO0;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27505o00OooOO.f96397OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o0o00o03 = o0o00o02;
            it = C34429OooOOo0.OooOO0o(App.f69549Oooo00O, App.f69550Oooo00o, App.f69548Oooo000, App.f69547Oooo0, App.f69551Oooo0O0, App.f69555Oooo0oO, App.f69554Oooo0o0, App.f69553Oooo0o, App.f69552Oooo0OO).iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c27505o00OooOO.f96393OooOo;
            o0O00o0 o0o00o04 = c27505o00OooOO.f96394OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            o0o00o03 = o0o00o04;
        }
        while (it.hasNext()) {
            AbstractC24338OooO0o0.OooO00o oooO00o = (AbstractC24338OooO0o0.OooO00o) it.next();
            C26577o000oo0O c26577o000oo0O = o0o00o03.f96921OooO00o;
            c27505o00OooOO.f96394OooOo0o = o0o00o03;
            c27505o00OooOO.f96393OooOo = it;
            c27505o00OooOO.f96397OooOoOO = 1;
            Object objOooO00o = C24332OooO.OooO00o(c26577o000oo0O.f91598OooO00o, new C26559o000Oooo(oooO00o, 0, null), c27505o00OooOO);
            if (objOooO00o != EnumC32485OooO00o.f116726OooOo0o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o == obj2) {
                return obj2;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (r6.OooO00o(r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o0(o0O00o0 o0o00o02, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27506o00OooOo c27506o00OooOo;
        AbstractC24338OooO0o0.OooO00o<String> oooO00oOooO0o0;
        o0o00o02.getClass();
        if (abstractC32479OooO0OO instanceof C27506o00OooOo) {
            c27506o00OooOo = (C27506o00OooOo) abstractC32479OooO0OO;
            int i = c27506o00OooOo.f96402OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27506o00OooOo.f96402OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27506o00OooOo = new C27506o00OooOo(o0o00o02, abstractC32479OooO0OO);
            }
        }
        Object obj = c27506o00OooOo.f96401OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27506o00OooOo.f96402OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC24338OooO0o0.OooO00o<String> oooO00oOooO0o02 = C24340OooO0oo.OooO0o0(o0OOOoo.OooOOO0.f95050OooO0Oo.f81922OooO00o);
            oooO00oOooO0o0 = C24340OooO0oo.OooO0o0(o0OOOoo.OooOOO0.f95052OooO0o0.f81922OooO00o);
            c27506o00OooOo.f96399OooOo0o = o0o00o02;
            c27506o00OooOo.f96398OooOo = oooO00oOooO0o0;
            c27506o00OooOo.f96402OooOoOO = 1;
            if (o0o00o02.f96921OooO00o.OooO00o(oooO00oOooO0o02, c27506o00OooOo) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        AbstractC24338OooO0o0.OooO00o<String> oooO00o = c27506o00OooOo.f96398OooOo;
        o0O00o0 o0o00o03 = c27506o00OooOo.f96399OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        oooO00oOooO0o0 = oooO00o;
        o0o00o02 = o0o00o03;
        C26577o000oo0O c26577o000oo0O = o0o00o02.f96921OooO00o;
        c27506o00OooOo.f96399OooOo0o = null;
        c27506o00OooOo.f96398OooOo = null;
        c27506o00OooOo.f96402OooOoOO = 2;
    }
}
