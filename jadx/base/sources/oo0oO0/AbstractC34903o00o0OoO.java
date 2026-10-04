package oo0oO0;

import com.aspose.slides.C22205OooOOo;
import com.orion.notein.data.p602db.entity.MergingLayerItemEntity;
import com.orion.notein.data.p602db.entity.PageLayerEntity;
import com.orion.notein.data.p602db.entity.UpdateNameEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.coroutines.Continuation;
import o000oo0o.C24718OooOO0o;
import o0OOO0Oo.C27027OooO0O0;
import o0OOO0Oo.C27029OooO0Oo;
import o0OOO0Oo.C27031OooO0o0;
import o0OOO0Oo.C27032OooO0oO;
import o0OOO0Oo.C27035OooOO0O;
import o0OOO0Oo.C27036OooOO0o;
import o0OOO0Oo.C27037OooOOO;
import o0OOO0Oo.C27039OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: oo0oO0.o00o0OoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC34903o00o0OoO {

    /* JADX INFO: renamed from: oo0oO0.o00o0OoO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.db.dao.PageLayerDao", m80623f = "PageLayerDao.kt", m80624l = {140, 141, 142, 143}, m80625m = "gatherAllLayerIdsForDebugging$suspendImpl")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public List f125444OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Object f125445OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public List f125446OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public List f125447OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public /* synthetic */ Object f125448OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public int f125449OooOoo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f125448OooOoOO = obj;
            this.f125449OooOoo |= Integer.MIN_VALUE;
            return AbstractC34903o00o0OoO.OooO(AbstractC34903o00o0OoO.this, this);
        }
    }

    /* JADX INFO: renamed from: oo0oO0.o00o0OoO$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.db.dao.PageLayerDao", m80623f = "PageLayerDao.kt", m80624l = {117, 118, 119, 120, 121}, m80625m = "getAllItemsCountInLayer$suspendImpl")
    public static final class OooO0O0 extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public String f125451OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public AbstractC34903o00o0OoO f125452OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public long f125453OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public long f125454OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public long f125455OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public /* synthetic */ Object f125456OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public long f125457OooOoo0;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public int f125459OooOooo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f125456OooOoo = obj;
            this.f125459OooOooo |= Integer.MIN_VALUE;
            return AbstractC34903o00o0OoO.OooOO0O(AbstractC34903o00o0OoO.this, null, this);
        }
    }

    /* JADX INFO: renamed from: oo0oO0.o00o0OoO$OooO0OO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.db.dao.PageLayerDao", m80623f = "PageLayerDao.kt", m80624l = {156, 157, 158, 159, 182, 183, 184, 185}, m80625m = "mergeDisplayItemsAcrossLayers$suspendImpl")
    public static final class OooO0OO extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public List f125460OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public AbstractC34903o00o0OoO f125461OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public List f125462OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public String f125463OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public List f125464OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public List f125465OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public List f125466OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public /* synthetic */ Object f125467OooOooO;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public int f125469Oooo000;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f125467OooOooO = obj;
            this.f125469Oooo000 |= Integer.MIN_VALUE;
            return AbstractC34903o00o0OoO.OooOo(AbstractC34903o00o0OoO.this, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object OooO(AbstractC34903o00o0OoO abstractC34903o00o0OoO, Continuation<? super List<String>> continuation) {
        OooO00o oooO00o;
        List listOooO0Oo;
        Object objOooOoOO;
        AbstractC34903o00o0OoO abstractC34903o00o0OoO2;
        List list;
        List list2;
        Object obj;
        List list3;
        AbstractC34903o00o0OoO abstractC34903o00o0OoO3;
        Object objOooOoo0;
        Object obj2;
        List list4;
        List list5;
        Object objOooOoO;
        List list6;
        List list7;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f125449OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f125449OooOoo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = abstractC34903o00o0OoO.new OooO00o(continuation);
            }
        }
        Object obj3 = oooO00o.f125448OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f125449OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj3);
            listOooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
            oooO00o.f125445OooOo0o = abstractC34903o00o0OoO;
            oooO00o.f125444OooOo = listOooO0Oo;
            oooO00o.f125447OooOoO0 = listOooO0Oo;
            oooO00o.f125446OooOoO = listOooO0Oo;
            oooO00o.f125449OooOoo = 1;
            objOooOoOO = abstractC34903o00o0OoO.OooOoOO(oooO00o);
            if (objOooOoOO != enumC32485OooO00o) {
                abstractC34903o00o0OoO2 = abstractC34903o00o0OoO;
                list = listOooO0Oo;
                list2 = list;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list6 = oooO00o.f125444OooOo;
                    list7 = (List) oooO00o.f125445OooOo0o;
                    C32446OooOOOo.OooO0O0(obj3);
                    list6.addAll((Collection) obj3);
                    return oOo000Oo.OooOo.Oooo0(com.facebook.soloader.OooOo.OooO0O0(list7));
                }
                list4 = oooO00o.f125446OooOoO;
                List list8 = oooO00o.f125447OooOoO0;
                list5 = oooO00o.f125444OooOo;
                abstractC34903o00o0OoO3 = (AbstractC34903o00o0OoO) oooO00o.f125445OooOo0o;
                C32446OooOOOo.OooO0O0(obj3);
                obj2 = obj3;
                listOooO0Oo = list8;
                list4.addAll((Collection) obj2);
                oooO00o.f125445OooOo0o = list5;
                oooO00o.f125444OooOo = listOooO0Oo;
                oooO00o.f125447OooOoO0 = null;
                oooO00o.f125446OooOoO = null;
                oooO00o.f125449OooOoo = 4;
                objOooOoO = abstractC34903o00o0OoO3.OooOoO(oooO00o);
                if (objOooOoO != enumC32485OooO00o) {
                    List list9 = listOooO0Oo;
                    obj3 = objOooOoO;
                    list6 = list9;
                    list7 = list5;
                    list6.addAll((Collection) obj3);
                    return oOo000Oo.OooOo.Oooo0(com.facebook.soloader.OooOo.OooO0O0(list7));
                }
                return enumC32485OooO00o;
            }
            list3 = oooO00o.f125446OooOoO;
            List list10 = oooO00o.f125447OooOoO0;
            List list11 = oooO00o.f125444OooOo;
            AbstractC34903o00o0OoO abstractC34903o00o0OoO4 = (AbstractC34903o00o0OoO) oooO00o.f125445OooOo0o;
            C32446OooOOOo.OooO0O0(obj3);
            obj = obj3;
            listOooO0Oo = list10;
            list2 = list11;
            abstractC34903o00o0OoO3 = abstractC34903o00o0OoO4;
            list3.addAll((Collection) obj);
            oooO00o.f125445OooOo0o = abstractC34903o00o0OoO3;
            oooO00o.f125444OooOo = list2;
            List list12 = listOooO0Oo;
            oooO00o.f125447OooOoO0 = list12;
            oooO00o.f125446OooOoO = list12;
            oooO00o.f125449OooOoo = 3;
            objOooOoo0 = abstractC34903o00o0OoO3.OooOoo0(oooO00o);
            if (objOooOoo0 != enumC32485OooO00o) {
                obj2 = objOooOoo0;
                list4 = listOooO0Oo;
                list5 = list2;
                list4.addAll((Collection) obj2);
                oooO00o.f125445OooOo0o = list5;
                oooO00o.f125444OooOo = listOooO0Oo;
                oooO00o.f125447OooOoO0 = null;
                oooO00o.f125446OooOoO = null;
                oooO00o.f125449OooOoo = 4;
                objOooOoO = abstractC34903o00o0OoO3.OooOoO(oooO00o);
                if (objOooOoO != enumC32485OooO00o) {
                }
            }
            return enumC32485OooO00o;
        }
        list = oooO00o.f125446OooOoO;
        List list13 = oooO00o.f125447OooOoO0;
        list2 = oooO00o.f125444OooOo;
        abstractC34903o00o0OoO2 = (AbstractC34903o00o0OoO) oooO00o.f125445OooOo0o;
        C32446OooOOOo.OooO0O0(obj3);
        objOooOoOO = obj3;
        listOooO0Oo = list13;
        list.addAll((Collection) objOooOoOO);
        oooO00o.f125445OooOo0o = abstractC34903o00o0OoO2;
        oooO00o.f125444OooOo = list2;
        List list14 = listOooO0Oo;
        oooO00o.f125447OooOoO0 = list14;
        oooO00o.f125446OooOoO = list14;
        oooO00o.f125449OooOoo = 2;
        Object objOooOoO0 = abstractC34903o00o0OoO2.OooOoO0(oooO00o);
        if (objOooOoO0 != enumC32485OooO00o) {
            obj = objOooOoO0;
            list3 = listOooO0Oo;
            abstractC34903o00o0OoO3 = abstractC34903o00o0OoO2;
            list3.addAll((Collection) obj);
            oooO00o.f125445OooOo0o = abstractC34903o00o0OoO3;
            oooO00o.f125444OooOo = list2;
            List list122 = listOooO0Oo;
            oooO00o.f125447OooOoO0 = list122;
            oooO00o.f125446OooOoO = list122;
            oooO00o.f125449OooOoo = 3;
            objOooOoo0 = abstractC34903o00o0OoO3.OooOoo0(oooO00o);
            if (objOooOoo0 != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object OooOO0O(AbstractC34903o00o0OoO abstractC34903o00o0OoO, String str, Continuation<? super Long> continuation) {
        OooO0O0 oooO0O0;
        AbstractC34903o00o0OoO abstractC34903o00o0OoO2;
        String str2;
        long j;
        AbstractC34903o00o0OoO abstractC34903o00o0OoO3;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f125459OooOooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f125459OooOooo = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = abstractC34903o00o0OoO.new OooO0O0(continuation);
            }
        }
        Object objOooOo0 = oooO0O0.f125456OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0O0.f125459OooOooo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOo0);
            oooO0O0.f125452OooOo0o = abstractC34903o00o0OoO;
            oooO0O0.f125451OooOo = str;
            oooO0O0.f125459OooOooo = 1;
            objOooOo0 = abstractC34903o00o0OoO.OooOo0(str, oooO0O0);
            if (objOooOo0 != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                j = oooO0O0.f125454OooOoO0;
                str2 = oooO0O0.f125451OooOo;
                abstractC34903o00o0OoO2 = oooO0O0.f125452OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOo0);
                long jLongValue = ((Number) objOooOo0).longValue();
                oooO0O0.f125452OooOo0o = abstractC34903o00o0OoO2;
                oooO0O0.f125451OooOo = str2;
                oooO0O0.f125454OooOoO0 = j;
                oooO0O0.f125453OooOoO = jLongValue;
                oooO0O0.f125459OooOooo = 3;
                objOooOo0 = abstractC34903o00o0OoO2.OooOOoo(str2, oooO0O0);
                if (objOooOo0 != enumC32485OooO00o) {
                    abstractC34903o00o0OoO3 = abstractC34903o00o0OoO2;
                    j2 = j;
                    j3 = jLongValue;
                    long jLongValue2 = ((Number) objOooOo0).longValue();
                    oooO0O0.f125452OooOo0o = abstractC34903o00o0OoO3;
                    oooO0O0.f125451OooOo = str2;
                    oooO0O0.f125454OooOoO0 = j2;
                    oooO0O0.f125453OooOoO = j3;
                    oooO0O0.f125455OooOoOO = jLongValue2;
                    oooO0O0.f125459OooOooo = 4;
                    objOooOo0 = abstractC34903o00o0OoO3.OooOo00(str2, oooO0O0);
                    if (objOooOo0 != enumC32485OooO00o) {
                    }
                }
                return enumC32485OooO00o;
            }
            if (i2 == 3) {
                j3 = oooO0O0.f125453OooOoO;
                j2 = oooO0O0.f125454OooOoO0;
                str2 = oooO0O0.f125451OooOo;
                AbstractC34903o00o0OoO abstractC34903o00o0OoO4 = oooO0O0.f125452OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOo0);
                abstractC34903o00o0OoO3 = abstractC34903o00o0OoO4;
                long jLongValue22 = ((Number) objOooOo0).longValue();
                oooO0O0.f125452OooOo0o = abstractC34903o00o0OoO3;
                oooO0O0.f125451OooOo = str2;
                oooO0O0.f125454OooOoO0 = j2;
                oooO0O0.f125453OooOoO = j3;
                oooO0O0.f125455OooOoOO = jLongValue22;
                oooO0O0.f125459OooOooo = 4;
                objOooOo0 = abstractC34903o00o0OoO3.OooOo00(str2, oooO0O0);
                if (objOooOo0 != enumC32485OooO00o) {
                    j4 = j2;
                    j5 = j3;
                    j6 = jLongValue22;
                    long jLongValue3 = ((Number) objOooOo0).longValue();
                    oooO0O0.f125452OooOo0o = null;
                    oooO0O0.f125451OooOo = null;
                    oooO0O0.f125454OooOoO0 = j4;
                    oooO0O0.f125453OooOoO = j5;
                    oooO0O0.f125455OooOoOO = j6;
                    oooO0O0.f125457OooOoo0 = jLongValue3;
                    oooO0O0.f125459OooOooo = 5;
                    objOooOo0 = abstractC34903o00o0OoO3.OooOo0O(str2, oooO0O0);
                    if (objOooOo0 != enumC32485OooO00o) {
                    }
                }
                return enumC32485OooO00o;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = oooO0O0.f125457OooOoo0;
                j7 = oooO0O0.f125455OooOoOO;
                j8 = oooO0O0.f125453OooOoO;
                j9 = oooO0O0.f125454OooOoO0;
                C32446OooOOOo.OooO0O0(objOooOo0);
                long jLongValue4 = ((Number) objOooOo0).longValue();
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("PageLayerDao");
                StringBuilder sb = new StringBuilder("getAllItemsCountInLayerId, strokesCount is ");
                sb.append(j9);
                C22205OooOOo.OooO0OO(j8, ", imagesCount is ", ", quotesCount is ", sb);
                sb.append(j7);
                C22205OooOOo.OooO0OO(j10, ", shapesCount is ", ", textBoxesCount is ", sb);
                sb.append(jLongValue4);
                c20358OooO00o.OooO0o0(sb.toString(), new Object[0]);
                return new Long(j9 + j8 + j7 + j10 + jLongValue4);
            }
            j6 = oooO0O0.f125455OooOoOO;
            j5 = oooO0O0.f125453OooOoO;
            j4 = oooO0O0.f125454OooOoO0;
            str2 = oooO0O0.f125451OooOo;
            abstractC34903o00o0OoO3 = oooO0O0.f125452OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOo0);
            long jLongValue32 = ((Number) objOooOo0).longValue();
            oooO0O0.f125452OooOo0o = null;
            oooO0O0.f125451OooOo = null;
            oooO0O0.f125454OooOoO0 = j4;
            oooO0O0.f125453OooOoO = j5;
            oooO0O0.f125455OooOoOO = j6;
            oooO0O0.f125457OooOoo0 = jLongValue32;
            oooO0O0.f125459OooOooo = 5;
            objOooOo0 = abstractC34903o00o0OoO3.OooOo0O(str2, oooO0O0);
            if (objOooOo0 != enumC32485OooO00o) {
                j7 = j6;
                j8 = j5;
                j9 = j4;
                j10 = jLongValue32;
                long jLongValue42 = ((Number) objOooOo0).longValue();
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("PageLayerDao");
                StringBuilder sb2 = new StringBuilder("getAllItemsCountInLayerId, strokesCount is ");
                sb2.append(j9);
                C22205OooOOo.OooO0OO(j8, ", imagesCount is ", ", quotesCount is ", sb2);
                sb2.append(j7);
                C22205OooOOo.OooO0OO(j10, ", shapesCount is ", ", textBoxesCount is ", sb2);
                sb2.append(jLongValue42);
                c20358OooO00o2.OooO0o0(sb2.toString(), new Object[0]);
                return new Long(j9 + j8 + j7 + j10 + jLongValue42);
            }
            return enumC32485OooO00o;
        }
        str = oooO0O0.f125451OooOo;
        abstractC34903o00o0OoO = oooO0O0.f125452OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOo0);
        long jLongValue5 = ((Number) objOooOo0).longValue();
        oooO0O0.f125452OooOo0o = abstractC34903o00o0OoO;
        oooO0O0.f125451OooOo = str;
        oooO0O0.f125454OooOoO0 = jLongValue5;
        oooO0O0.f125459OooOooo = 2;
        objOooOo0 = abstractC34903o00o0OoO.OooOO0o(str, oooO0O0);
        if (objOooOo0 != enumC32485OooO00o) {
            abstractC34903o00o0OoO2 = abstractC34903o00o0OoO;
            str2 = str;
            j = jLongValue5;
            long jLongValue6 = ((Number) objOooOo0).longValue();
            oooO0O0.f125452OooOo0o = abstractC34903o00o0OoO2;
            oooO0O0.f125451OooOo = str2;
            oooO0O0.f125454OooOoO0 = j;
            oooO0O0.f125453OooOoO = jLongValue6;
            oooO0O0.f125459OooOooo = 3;
            objOooOo0 = abstractC34903o00o0OoO2.OooOOoo(str2, oooO0O0);
            if (objOooOo0 != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x033b, code lost:
    
        if (r1.Oooo00o(r0, r3) != r4) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02fa A[PHI: r0 r1
      0x02fa: PHI (r0v52 java.util.List) = (r0v49 java.util.List), (r0v54 java.util.List) binds: [B:82:0x02f7, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x02fa: PHI (r1v26 oo0oO0.o00o0OoO) = (r1v24 oo0oO0.o00o0OoO), (r1v27 oo0oO0.o00o0OoO) binds: [B:82:0x02f7, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x031d A[PHI: r0 r1
      0x031d: PHI (r0v55 java.util.List) = (r0v52 java.util.List), (r0v63 java.util.List) binds: [B:85:0x031a, B:13:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x031d: PHI (r1v28 oo0oO0.o00o0OoO) = (r1v26 oo0oO0.o00o0OoO), (r1v29 oo0oO0.o00o0OoO) binds: [B:85:0x031a, B:13:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ce A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object OooOo(AbstractC34903o00o0OoO abstractC34903o00o0OoO, List<String> list, String str, Continuation<? super C32460OooOooO> continuation) {
        OooO0OO oooO0OO;
        List listOooO0Oo;
        String str2;
        Object objOooO0o;
        List list2;
        List list3;
        List list4;
        String str3;
        List list5;
        List<String> list6;
        List list7;
        List list8;
        AbstractC34903o00o0OoO abstractC34903o00o0OoO2;
        List list9;
        List list10;
        String str4;
        List list11;
        List list12;
        List list13;
        List list14;
        List<String> list15;
        AbstractC34903o00o0OoO abstractC34903o00o0OoO3;
        ListIterator listIterator;
        C32465OooO0O0.C20232OooO0O0 c20232OooO0O0;
        List list16;
        AbstractC34903o00o0OoO abstractC34903o00o0OoO4;
        MergingLayerItemEntity[] mergingLayerItemEntityArr;
        MergingLayerItemEntity[] mergingLayerItemEntityArr2;
        AbstractC34903o00o0OoO abstractC34903o00o0OoO5 = abstractC34903o00o0OoO;
        List<String> list17 = list;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f125469Oooo000;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f125469Oooo000 = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = abstractC34903o00o0OoO5.new OooO0OO(continuation);
            }
        }
        Object objOooO0Oo = oooO0OO.f125467OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        switch (oooO0OO.f125469Oooo000) {
            case 0:
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                ArrayList arrayList = new ArrayList();
                listOooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
                oooO0OO.f125461OooOo0o = abstractC34903o00o0OoO5;
                oooO0OO.f125460OooOo = list17;
                str2 = str;
                oooO0OO.f125463OooOoO0 = str2;
                oooO0OO.f125462OooOoO = arrayList;
                oooO0OO.f125464OooOoOO = listOooO0Oo;
                oooO0OO.f125466OooOoo0 = listOooO0Oo;
                oooO0OO.f125465OooOoo = listOooO0Oo;
                oooO0OO.f125469Oooo000 = 1;
                objOooO0o = abstractC34903o00o0OoO5.OooO0o(list17, oooO0OO);
                if (objOooO0o != enumC32485OooO00o) {
                    list2 = listOooO0Oo;
                    list3 = arrayList;
                    list4 = list2;
                    listOooO0Oo.addAll((Collection) objOooO0o);
                    oooO0OO.f125461OooOo0o = abstractC34903o00o0OoO5;
                    oooO0OO.f125460OooOo = list17;
                    oooO0OO.f125463OooOoO0 = str2;
                    oooO0OO.f125462OooOoO = list3;
                    oooO0OO.f125464OooOoOO = list2;
                    List list18 = list4;
                    oooO0OO.f125466OooOoo0 = list18;
                    oooO0OO.f125465OooOoo = list18;
                    oooO0OO.f125469Oooo000 = 2;
                    objOooO0Oo = abstractC34903o00o0OoO5.OooO0Oo(list17, oooO0OO);
                    if (objOooO0Oo != enumC32485OooO00o) {
                        str3 = str2;
                        list5 = list2;
                        list6 = list17;
                        list7 = list4;
                        list8 = list3;
                        abstractC34903o00o0OoO2 = abstractC34903o00o0OoO5;
                        list9 = list7;
                        list9.addAll((Collection) objOooO0Oo);
                        oooO0OO.f125461OooOo0o = abstractC34903o00o0OoO2;
                        oooO0OO.f125460OooOo = list6;
                        oooO0OO.f125463OooOoO0 = str3;
                        oooO0OO.f125462OooOoO = list8;
                        oooO0OO.f125464OooOoOO = list5;
                        List list19 = list7;
                        oooO0OO.f125466OooOoo0 = list19;
                        oooO0OO.f125465OooOoo = list19;
                        oooO0OO.f125469Oooo000 = 3;
                        objOooO0Oo = abstractC34903o00o0OoO2.OooO0oO(list6, oooO0OO);
                        if (objOooO0Oo != enumC32485OooO00o) {
                            String str5 = str3;
                            list10 = list8;
                            str4 = str5;
                            list11 = list7;
                            list11.addAll((Collection) objOooO0Oo);
                            oooO0OO.f125461OooOo0o = abstractC34903o00o0OoO2;
                            oooO0OO.f125460OooOo = list6;
                            oooO0OO.f125463OooOoO0 = str4;
                            oooO0OO.f125462OooOoO = list10;
                            oooO0OO.f125464OooOoOO = list5;
                            oooO0OO.f125466OooOoo0 = list7;
                            oooO0OO.f125465OooOoo = null;
                            oooO0OO.f125469Oooo000 = 4;
                            objOooO0Oo = abstractC34903o00o0OoO2.OooO0o0(list6, oooO0OO);
                            if (objOooO0Oo != enumC32485OooO00o) {
                                list12 = list7;
                                list13 = list5;
                                list14 = list10;
                                list15 = list6;
                                abstractC34903o00o0OoO3 = abstractC34903o00o0OoO2;
                                String str6 = str4;
                                list12.addAll((Collection) objOooO0Oo);
                                C32465OooO0O0 c32465OooO0O0OooO0O0 = com.facebook.soloader.OooOo.OooO0O0(list13);
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                listIterator = c32465OooO0O0OooO0O0.listIterator(0);
                                while (true) {
                                    c20232OooO0O0 = (C32465OooO0O0.C20232OooO0O0) listIterator;
                                    if (c20232OooO0O0.hasNext()) {
                                        kotlin.jvm.internal.Oooo000 oooo000 = new kotlin.jvm.internal.Oooo000();
                                        oooo000.f80941OooOo0o = System.currentTimeMillis();
                                        Iterator<T> it = list15.iterator();
                                        while (it.hasNext()) {
                                            List list20 = (List) linkedHashMap.get((String) it.next());
                                            if (list20 != null) {
                                                List list21 = list20;
                                                Iterator it2 = list21.iterator();
                                                if (!it2.hasNext()) {
                                                    throw new NoSuchElementException();
                                                }
                                                long creationTime = ((MergingLayerItemEntity) it2.next()).getCreationTime();
                                                while (true) {
                                                    long j = creationTime;
                                                    while (it2.hasNext()) {
                                                        creationTime = ((MergingLayerItemEntity) it2.next()).getCreationTime();
                                                        if (j > creationTime) {
                                                        }
                                                        break;
                                                    }
                                                    ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list21, 10));
                                                    for (Iterator it3 = list21.iterator(); it3.hasNext(); it3 = it3) {
                                                        MergingLayerItemEntity mergingLayerItemEntity = (MergingLayerItemEntity) it3.next();
                                                        arrayList2.add(MergingLayerItemEntity.copy$default(mergingLayerItemEntity, null, str6, (mergingLayerItemEntity.getCreationTime() - j) + oooo000.f80941OooOo0o + 1, 1, null));
                                                    }
                                                    Iterator it4 = arrayList2.iterator();
                                                    if (!it4.hasNext()) {
                                                        throw new NoSuchElementException();
                                                    }
                                                    Long l = new Long(((MergingLayerItemEntity) it4.next()).getCreationTime());
                                                    while (it4.hasNext()) {
                                                        Long l2 = new Long(((MergingLayerItemEntity) it4.next()).getCreationTime());
                                                        if (l.compareTo(l2) < 0) {
                                                            l = l2;
                                                        }
                                                    }
                                                    oooo000.f80941OooOo0o = l.longValue();
                                                    list14.addAll(arrayList2);
                                                }
                                            }
                                        }
                                        MergingLayerItemEntity[] mergingLayerItemEntityArr3 = (MergingLayerItemEntity[]) list14.toArray(new MergingLayerItemEntity[0]);
                                        MergingLayerItemEntity[] mergingLayerItemEntityArr4 = (MergingLayerItemEntity[]) Arrays.copyOf(mergingLayerItemEntityArr3, mergingLayerItemEntityArr3.length);
                                        oooO0OO.f125461OooOo0o = abstractC34903o00o0OoO3;
                                        oooO0OO.f125460OooOo = list14;
                                        oooO0OO.f125463OooOoO0 = null;
                                        oooO0OO.f125462OooOoO = null;
                                        oooO0OO.f125464OooOoOO = null;
                                        oooO0OO.f125466OooOoo0 = null;
                                        oooO0OO.f125469Oooo000 = 5;
                                        if (abstractC34903o00o0OoO3.Oooo0(mergingLayerItemEntityArr4, oooO0OO) != enumC32485OooO00o) {
                                            list16 = list14;
                                            abstractC34903o00o0OoO4 = abstractC34903o00o0OoO3;
                                            MergingLayerItemEntity[] mergingLayerItemEntityArr5 = (MergingLayerItemEntity[]) list16.toArray(new MergingLayerItemEntity[0]);
                                            mergingLayerItemEntityArr = (MergingLayerItemEntity[]) Arrays.copyOf(mergingLayerItemEntityArr5, mergingLayerItemEntityArr5.length);
                                            oooO0OO.f125461OooOo0o = abstractC34903o00o0OoO4;
                                            oooO0OO.f125460OooOo = list16;
                                            oooO0OO.f125469Oooo000 = 6;
                                            if (abstractC34903o00o0OoO4.OooOooo(mergingLayerItemEntityArr, oooO0OO) != enumC32485OooO00o) {
                                                MergingLayerItemEntity[] mergingLayerItemEntityArr6 = (MergingLayerItemEntity[]) list16.toArray(new MergingLayerItemEntity[0]);
                                                mergingLayerItemEntityArr2 = (MergingLayerItemEntity[]) Arrays.copyOf(mergingLayerItemEntityArr6, mergingLayerItemEntityArr6.length);
                                                oooO0OO.f125461OooOo0o = abstractC34903o00o0OoO4;
                                                oooO0OO.f125460OooOo = list16;
                                                oooO0OO.f125469Oooo000 = 7;
                                                if (abstractC34903o00o0OoO4.Oooo0O0(mergingLayerItemEntityArr2, oooO0OO) != enumC32485OooO00o) {
                                                    MergingLayerItemEntity[] mergingLayerItemEntityArr7 = (MergingLayerItemEntity[]) list16.toArray(new MergingLayerItemEntity[0]);
                                                    MergingLayerItemEntity[] mergingLayerItemEntityArr8 = (MergingLayerItemEntity[]) Arrays.copyOf(mergingLayerItemEntityArr7, mergingLayerItemEntityArr7.length);
                                                    oooO0OO.f125461OooOo0o = null;
                                                    oooO0OO.f125460OooOo = null;
                                                    oooO0OO.f125469Oooo000 = 8;
                                                }
                                            }
                                        }
                                    } else {
                                        Object next = c20232OooO0O0.next();
                                        String layerId = ((MergingLayerItemEntity) next).getLayerId();
                                        Object arrayList3 = linkedHashMap.get(layerId);
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                            linkedHashMap.put(layerId, arrayList3);
                                        }
                                        ((List) arrayList3).add(next);
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return enumC32485OooO00o;
            case 1:
                List list22 = oooO0OO.f125465OooOoo;
                List list23 = oooO0OO.f125466OooOoo0;
                List list24 = oooO0OO.f125464OooOoOO;
                List list25 = oooO0OO.f125462OooOoO;
                String str7 = oooO0OO.f125463OooOoO0;
                List<String> list26 = oooO0OO.f125460OooOo;
                AbstractC34903o00o0OoO abstractC34903o00o0OoO6 = oooO0OO.f125461OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                listOooO0Oo = list22;
                abstractC34903o00o0OoO5 = abstractC34903o00o0OoO6;
                list3 = list25;
                list4 = list23;
                list17 = list26;
                list2 = list24;
                str2 = str7;
                objOooO0o = objOooO0Oo;
                listOooO0Oo.addAll((Collection) objOooO0o);
                oooO0OO.f125461OooOo0o = abstractC34903o00o0OoO5;
                oooO0OO.f125460OooOo = list17;
                oooO0OO.f125463OooOoO0 = str2;
                oooO0OO.f125462OooOoO = list3;
                oooO0OO.f125464OooOoOO = list2;
                List list182 = list4;
                oooO0OO.f125466OooOoo0 = list182;
                oooO0OO.f125465OooOoo = list182;
                oooO0OO.f125469Oooo000 = 2;
                objOooO0Oo = abstractC34903o00o0OoO5.OooO0Oo(list17, oooO0OO);
                if (objOooO0Oo != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 2:
                list9 = oooO0OO.f125465OooOoo;
                list7 = oooO0OO.f125466OooOoo0;
                list5 = oooO0OO.f125464OooOoOO;
                list8 = oooO0OO.f125462OooOoO;
                str3 = oooO0OO.f125463OooOoO0;
                list6 = oooO0OO.f125460OooOo;
                abstractC34903o00o0OoO2 = oooO0OO.f125461OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                list9.addAll((Collection) objOooO0Oo);
                oooO0OO.f125461OooOo0o = abstractC34903o00o0OoO2;
                oooO0OO.f125460OooOo = list6;
                oooO0OO.f125463OooOoO0 = str3;
                oooO0OO.f125462OooOoO = list8;
                oooO0OO.f125464OooOoOO = list5;
                List list192 = list7;
                oooO0OO.f125466OooOoo0 = list192;
                oooO0OO.f125465OooOoo = list192;
                oooO0OO.f125469Oooo000 = 3;
                objOooO0Oo = abstractC34903o00o0OoO2.OooO0oO(list6, oooO0OO);
                if (objOooO0Oo != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 3:
                list11 = oooO0OO.f125465OooOoo;
                list7 = oooO0OO.f125466OooOoo0;
                list5 = oooO0OO.f125464OooOoOO;
                List list27 = oooO0OO.f125462OooOoO;
                String str8 = oooO0OO.f125463OooOoO0;
                list6 = oooO0OO.f125460OooOo;
                abstractC34903o00o0OoO2 = oooO0OO.f125461OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                list10 = list27;
                str4 = str8;
                list11.addAll((Collection) objOooO0Oo);
                oooO0OO.f125461OooOo0o = abstractC34903o00o0OoO2;
                oooO0OO.f125460OooOo = list6;
                oooO0OO.f125463OooOoO0 = str4;
                oooO0OO.f125462OooOoO = list10;
                oooO0OO.f125464OooOoOO = list5;
                oooO0OO.f125466OooOoo0 = list7;
                oooO0OO.f125465OooOoo = null;
                oooO0OO.f125469Oooo000 = 4;
                objOooO0Oo = abstractC34903o00o0OoO2.OooO0o0(list6, oooO0OO);
                if (objOooO0Oo != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 4:
                list12 = oooO0OO.f125466OooOoo0;
                list13 = oooO0OO.f125464OooOoOO;
                list14 = oooO0OO.f125462OooOoO;
                str4 = oooO0OO.f125463OooOoO0;
                list15 = oooO0OO.f125460OooOo;
                abstractC34903o00o0OoO3 = oooO0OO.f125461OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                String str62 = str4;
                list12.addAll((Collection) objOooO0Oo);
                C32465OooO0O0 c32465OooO0O0OooO0O02 = com.facebook.soloader.OooOo.OooO0O0(list13);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                listIterator = c32465OooO0O0OooO0O02.listIterator(0);
                while (true) {
                    c20232OooO0O0 = (C32465OooO0O0.C20232OooO0O0) listIterator;
                    if (c20232OooO0O0.hasNext()) {
                    }
                    ((List) arrayList3).add(next);
                }
                break;
            case 5:
                list16 = oooO0OO.f125460OooOo;
                abstractC34903o00o0OoO4 = oooO0OO.f125461OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                MergingLayerItemEntity[] mergingLayerItemEntityArr52 = (MergingLayerItemEntity[]) list16.toArray(new MergingLayerItemEntity[0]);
                mergingLayerItemEntityArr = (MergingLayerItemEntity[]) Arrays.copyOf(mergingLayerItemEntityArr52, mergingLayerItemEntityArr52.length);
                oooO0OO.f125461OooOo0o = abstractC34903o00o0OoO4;
                oooO0OO.f125460OooOo = list16;
                oooO0OO.f125469Oooo000 = 6;
                if (abstractC34903o00o0OoO4.OooOooo(mergingLayerItemEntityArr, oooO0OO) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 6:
                list16 = oooO0OO.f125460OooOo;
                abstractC34903o00o0OoO4 = oooO0OO.f125461OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                MergingLayerItemEntity[] mergingLayerItemEntityArr62 = (MergingLayerItemEntity[]) list16.toArray(new MergingLayerItemEntity[0]);
                mergingLayerItemEntityArr2 = (MergingLayerItemEntity[]) Arrays.copyOf(mergingLayerItemEntityArr62, mergingLayerItemEntityArr62.length);
                oooO0OO.f125461OooOo0o = abstractC34903o00o0OoO4;
                oooO0OO.f125460OooOo = list16;
                oooO0OO.f125469Oooo000 = 7;
                if (abstractC34903o00o0OoO4.Oooo0O0(mergingLayerItemEntityArr2, oooO0OO) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 7:
                list16 = oooO0OO.f125460OooOo;
                abstractC34903o00o0OoO4 = oooO0OO.f125461OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                MergingLayerItemEntity[] mergingLayerItemEntityArr72 = (MergingLayerItemEntity[]) list16.toArray(new MergingLayerItemEntity[0]);
                MergingLayerItemEntity[] mergingLayerItemEntityArr82 = (MergingLayerItemEntity[]) Arrays.copyOf(mergingLayerItemEntityArr72, mergingLayerItemEntityArr72.length);
                oooO0OO.f125461OooOo0o = null;
                oooO0OO.f125460OooOo = null;
                oooO0OO.f125469Oooo000 = 8;
                break;
            case 8:
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r5.OooO00o(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object OooOooO(AbstractC34903o00o0OoO abstractC34903o00o0OoO, String str, ArrayList arrayList, Continuation continuation) {
        C34904o00o0Ooo c34904o00o0Ooo;
        List list;
        if (continuation instanceof C34904o00o0Ooo) {
            c34904o00o0Ooo = (C34904o00o0Ooo) continuation;
            int i = c34904o00o0Ooo.f125474OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34904o00o0Ooo.f125474OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c34904o00o0Ooo = new C34904o00o0Ooo(abstractC34903o00o0OoO, continuation);
            }
        }
        Object obj = c34904o00o0Ooo.f125473OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c34904o00o0Ooo.f125474OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c34904o00o0Ooo.f125471OooOo0o = abstractC34903o00o0OoO;
            c34904o00o0Ooo.f125470OooOo = arrayList;
            c34904o00o0Ooo.f125474OooOoOO = 1;
            list = arrayList;
            if (abstractC34903o00o0OoO.OooO0OO(str, c34904o00o0Ooo) != enumC32485OooO00o) {
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
        List list2 = c34904o00o0Ooo.f125470OooOo;
        abstractC34903o00o0OoO = c34904o00o0Ooo.f125471OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        list = list2;
        PageLayerEntity[] pageLayerEntityArr = (PageLayerEntity[]) list.toArray(new PageLayerEntity[0]);
        PageLayerEntity[] pageLayerEntityArr2 = (PageLayerEntity[]) Arrays.copyOf(pageLayerEntityArr, pageLayerEntityArr.length);
        c34904o00o0Ooo.f125471OooOo0o = null;
        c34904o00o0Ooo.f125470OooOo = null;
        c34904o00o0Ooo.f125474OooOoOO = 2;
    }

    public abstract Object OooO00o(PageLayerEntity[] pageLayerEntityArr, AbstractC32479OooO0OO abstractC32479OooO0OO);

    public abstract Object OooO0O0(PageLayerEntity[] pageLayerEntityArr, C27027OooO0O0 c27027OooO0O0);

    public abstract Object OooO0OO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO);

    public abstract Object OooO0Oo(List list, OooO0OO oooO0OO);

    public abstract Object OooO0o(List list, OooO0OO oooO0OO);

    public abstract Object OooO0o0(List list, OooO0OO oooO0OO);

    public abstract Object OooO0oO(List list, OooO0OO oooO0OO);

    public Object OooO0oo(C27029OooO0Oo c27029OooO0Oo) {
        return OooO(this, c27029OooO0Oo);
    }

    public Object OooOO0(String str, C27031OooO0o0 c27031OooO0o0) {
        return OooOO0O(this, str, c27031OooO0o0);
    }

    public abstract Object OooOO0o(String str, OooO0O0 oooO0O0);

    public abstract Object OooOOO(List list, C27032OooO0oO c27032OooO0oO);

    public abstract C24718OooOO0o OooOOO0(List list);

    public abstract Object OooOOOO(String str, AbstractC32476OooO abstractC32476OooO);

    public abstract C24718OooOO0o OooOOOo(String str);

    public abstract Object OooOOo(AbstractC32476OooO abstractC32476OooO);

    public abstract List<PageLayerEntity> OooOOo0(String str);

    public abstract Object OooOOoo(String str, OooO0O0 oooO0O0);

    public abstract Object OooOo0(String str, OooO0O0 oooO0O0);

    public abstract Object OooOo00(String str, OooO0O0 oooO0O0);

    public abstract Object OooOo0O(String str, OooO0O0 oooO0O0);

    public Object OooOo0o(List list, String str, C27035OooOO0O c27035OooOO0O) {
        return OooOo(this, list, str, c27035OooOO0O);
    }

    public abstract Object OooOoO(OooO00o oooO00o);

    public abstract Object OooOoO0(OooO00o oooO00o);

    public abstract Object OooOoOO(OooO00o oooO00o);

    public Object OooOoo(String str, ArrayList arrayList, C27036OooOO0o c27036OooOO0o) {
        return OooOooO(this, str, arrayList, c27036OooOO0o);
    }

    public abstract Object OooOoo0(OooO00o oooO00o);

    public abstract Object OooOooo(MergingLayerItemEntity[] mergingLayerItemEntityArr, OooO0OO oooO0OO);

    public abstract Object Oooo0(MergingLayerItemEntity[] mergingLayerItemEntityArr, OooO0OO oooO0OO);

    public abstract Object Oooo000(UpdateNameEntity[] updateNameEntityArr, C27037OooOOO c27037OooOOO);

    public abstract Object Oooo00O(PageLayerEntity[] pageLayerEntityArr, C27039OooOOOO c27039OooOOOO);

    public abstract Object Oooo00o(MergingLayerItemEntity[] mergingLayerItemEntityArr, OooO0OO oooO0OO);

    public abstract Object Oooo0O0(MergingLayerItemEntity[] mergingLayerItemEntityArr, OooO0OO oooO0OO);
}
