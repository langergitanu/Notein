package o0OO00o0;

import android.graphics.RectF;
import android.os.SystemClock;
import com.orion.notein.data.p602db.entity.StrokeEntity;
import com.orion.notein.domain.mapper.StrokeMapper;
import com.orion.notein.domain.models.page.Stroke;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.InkStrokeInfo;
import com.orion.penkit.models.PressurePoint;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o0OO000o.C26454OooO0Oo;
import o0OO000o.C26466OooO0o0;
import o0OOo0Oo.InterfaceC27323Oooo0oO;
import o0OOo0o.C27419o000o00o;
import o0OOo0o.C27438o000ooo;
import o0OoO0oo.C28932o00o0o0O;
import o0OoO0oo.C28956o00oOo00;
import o0o0OoOo.C30744OooOo0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33734OooOOoo;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo00O0O.C34467OooOo0;
import oo0oO0.AbstractC34993o0ooOoOO;

/* JADX INFO: renamed from: o0OO00o0.o00o0O00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26665o00o0O00 implements InterfaceC27323Oooo0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C26660o00o00o0 f92025OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final StrokeMapper f92026OooO0O0;

    public C26665o00o0O00(C26660o00o00o0 strokeLocalDataSource, StrokeMapper mapper) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(strokeLocalDataSource, "strokeLocalDataSource");
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        this.f92025OooO00o = strokeLocalDataSource;
        this.f92026OooO0O0 = mapper;
        C34467OooOo0.OooO00o(new C26659o00o00o());
    }

    @Override // o0OOo0Oo.InterfaceC27323Oooo0oO
    public final Object OooO(String str, String str2, C30744OooOo0o c30744OooOo0o) {
        C26660o00o00o0 c26660o00o00o0 = this.f92025OooO00o;
        c26660o00o00o0.getClass();
        return c26660o00o00o0.OooO00o(str2, new C26652o00o00(str, null));
    }

    @Override // o0OOo0Oo.InterfaceC27323Oooo0oO
    public final Object OooO00o(String str, String str2, C27438o000ooo c27438o000ooo) {
        C26660o00o00o0 c26660o00o00o0 = this.f92025OooO00o;
        c26660o00o00o0.getClass();
        Object objOooO00o = c26660o00o00o0.OooO00o(str2, new C26655o00o000O(str, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27323Oooo0oO
    public final Object OooO0O0(ArrayList arrayList, String str, C28932o00o0o0O c28932o00o0o0O) {
        C26660o00o00o0 c26660o00o00o0 = this.f92025OooO00o;
        c26660o00o00o0.getClass();
        Object objOooO00o = c26660o00o00o0.OooO00o(str, new C26653o00o000(arrayList, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27323Oooo0oO
    public final C33734OooOOoo OooO0OO(String noteId) {
        C26660o00o00o0 c26660o00o00o0 = this.f92025OooO00o;
        c26660o00o00o0.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        C26454OooO0Oo c26454OooO0Oo = c26660o00o00o0.f92002OooO00o;
        c26454OooO0Oo.getClass();
        c26454OooO0Oo.OooO0O0(noteId);
        AbstractC34993o0ooOoOO strokeDao = c26454OooO0Oo.OooO0o(noteId).Oooo0();
        kotlin.jvm.internal.OooOOO0.OooO0oO(strokeDao, "strokeDao");
        return new C33734OooOOoo(strokeDao.OooO0o(), new C26466OooO0o0(c26454OooO0Oo, noteId, null));
    }

    @Override // o0OOo0Oo.InterfaceC27323Oooo0oO
    public final Object OooO0Oo(List list, String str, C28956o00oOo00 c28956o00oOo00) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Stroke) it.next()).getId());
        }
        C26660o00o00o0 c26660o00o00o0 = this.f92025OooO00o;
        c26660o00o00o0.getClass();
        Object objOooO00o = c26660o00o00o0.OooO00o(str, new C26653o00o000(arrayList, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27323Oooo0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(AbstractList abstractList, String str, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26661o00o00oO c26661o00o00oO;
        Iterator it;
        String str2;
        C26665o00o0O00 c26665o00o0O00;
        if (abstractC32479OooO0OO instanceof C26661o00o00oO) {
            c26661o00o00oO = (C26661o00o00oO) abstractC32479OooO0OO;
            int i = c26661o00o00oO.f92008OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26661o00o00oO.f92008OooOoo = i - Integer.MIN_VALUE;
            } else {
                c26661o00o00oO = new C26661o00o00oO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26661o00o00oO.f92007OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26661o00o00oO.f92008OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            it = oOo000Oo.OooOo.Oooo00O(abstractList, 100).iterator();
            str2 = str;
            c26665o00o0O00 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z2 = c26661o00o00oO.f92005OooOoO;
            it = c26661o00o00oO.f92006OooOoO0;
            String str3 = c26661o00o00oO.f92003OooOo;
            c26665o00o0O00 = c26661o00o00oO.f92004OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            z = z2;
            str2 = str3;
        }
        while (it.hasNext()) {
            List list = (List) it.next();
            C26660o00o00o0 c26660o00o00o0 = c26665o00o0O00.f92025OooO00o;
            List list2 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(c26665o00o0O00.f92026OooO0O0.toEntity((Stroke) it2.next()));
            }
            c26661o00o00oO.f92004OooOo0o = c26665o00o0O00;
            c26661o00o00oO.f92003OooOo = str2;
            c26661o00o00oO.f92006OooOoO0 = it;
            c26661o00o00oO.f92005OooOoO = z;
            c26661o00o00oO.f92008OooOoo = 1;
            c26660o00o00o0.getClass();
            Object objOooO00o = c26660o00o00o0.OooO00o(str2, new C26654o00o0000(z, arrayList, null));
            if (objOooO00o != EnumC32485OooO00o.f116726OooOo0o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27323Oooo0oO
    public final Object OooO0o0(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26660o00o00o0 c26660o00o00o0 = this.f92025OooO00o;
        c26660o00o00o0.getClass();
        Object objOooO00o = c26660o00o00o0.OooO00o(str2, new C26656o00o000o(str, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27323Oooo0oO
    public final Object OooO0oO(String str, C27419o000o00o c27419o000o00o) {
        C26660o00o00o0 c26660o00o00o0 = this.f92025OooO00o;
        c26660o00o00o0.getClass();
        Object objOooO00o = c26660o00o00o0.OooO00o(str, new C26650o00Ooooo(2, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27323Oooo0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26662o00o00oo c26662o00o00oo;
        long jElapsedRealtime;
        C26665o00o0O00 c26665o00o0O00;
        String str3;
        List<StrokeEntity> list;
        long j;
        long j2;
        androidx.ink.strokes.OooOOO0 stroke;
        androidx.ink.strokes.OooO00o oooO00o;
        List<PressurePoint> points;
        if (abstractC32479OooO0OO instanceof C26662o00o00oo) {
            c26662o00o00oo = (C26662o00o00oo) abstractC32479OooO0OO;
            int i = c26662o00o00oo.f92015OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26662o00o00oo.f92015OooOoo = i - Integer.MIN_VALUE;
            } else {
                c26662o00o00oo = new C26662o00o00oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26662o00o00oo.f92014OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26662o00o00oo.f92015OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            jElapsedRealtime = SystemClock.elapsedRealtime();
            c26662o00o00oo.f92011OooOo0o = this;
            c26662o00o00oo.f92010OooOo = str;
            c26662o00o00oo.f92013OooOoO0 = jElapsedRealtime;
            c26662o00o00oo.f92015OooOoo = 1;
            C26660o00o00o0 c26660o00o00o0 = this.f92025OooO00o;
            c26660o00o00o0.getClass();
            objOooO00o = c26660o00o00o0.OooO00o(str2, new oo00oO(str, null));
            if (objOooO00o != enumC32485OooO00o) {
                c26665o00o0O00 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = c26662o00o00oo.f92012OooOoO;
            j = c26662o00o00oo.f92013OooOoO0;
            list = (List) c26662o00o00oo.f92010OooOo;
            str3 = (String) c26662o00o00oo.f92011OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            int iOooO0OO = 0;
            for (Stroke stroke2 : (List) objOooO00o) {
                DrawRecord record = stroke2.getRecord();
                int size = (record == null || (points = record.getPoints()) == null) ? 0 : points.size();
                InkStrokeInfo inkStroke = stroke2.getInkStroke();
                iOooO0OO += size + ((inkStroke == null || (stroke = inkStroke.getStroke()) == null || (oooO00o = stroke.f65488OooO0OO) == null) ? 0 : oooO00o.OooO0OO());
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("StrokeRepo");
            c20358OooO00o.OooO00o("getStrokesByPageId: pageId=%s stroke count=%d points=%d dbTime=%dms buildTime=%dms", str3, new Integer(list.size()), new Integer(iOooO0OO), new Long(j2 - j), new Long(jElapsedRealtime2 - j2));
            return objOooO00o;
        }
        long j3 = c26662o00o00oo.f92013OooOoO0;
        String str4 = (String) c26662o00o00oo.f92010OooOo;
        c26665o00o0O00 = (C26665o00o0O00) c26662o00o00oo.f92011OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO00o);
        jElapsedRealtime = j3;
        str = str4;
        List<StrokeEntity> list2 = (List) objOooO00o;
        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
        StrokeMapper strokeMapper = c26665o00o0O00.f92026OooO0O0;
        c26662o00o00oo.f92011OooOo0o = str;
        c26662o00o00oo.f92010OooOo = list2;
        c26662o00o00oo.f92013OooOoO0 = jElapsedRealtime;
        c26662o00o00oo.f92012OooOoO = jElapsedRealtime3;
        c26662o00o00oo.f92015OooOoo = 2;
        objOooO00o = strokeMapper.toStrokesParallel(list2, c26662o00o00oo);
        if (objOooO00o != enumC32485OooO00o) {
            str3 = str;
            list = list2;
            j = jElapsedRealtime;
            j2 = jElapsedRealtime3;
            long jElapsedRealtime22 = SystemClock.elapsedRealtime();
            int iOooO0OO2 = 0;
            while (r4.hasNext()) {
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("StrokeRepo");
            c20358OooO00o2.OooO00o("getStrokesByPageId: pageId=%s stroke count=%d points=%d dbTime=%dms buildTime=%dms", str3, new Integer(list.size()), new Integer(iOooO0OO2), new Long(j2 - j), new Long(jElapsedRealtime22 - j2));
            return objOooO00o;
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27323Oooo0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(String str, String str2, RectF rectF, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26651o00o0 c26651o00o0;
        C26665o00o0O00 c26665o00o0O00;
        if (abstractC32479OooO0OO instanceof C26651o00o0) {
            c26651o00o0 = (C26651o00o0) abstractC32479OooO0OO;
            int i = c26651o00o0.f91979OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26651o00o0.f91979OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26651o00o0 = new C26651o00o0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26651o00o0.f91977OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26651o00o0.f91979OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26651o00o0.f91978OooOo0o = this;
            c26651o00o0.f91979OooOoO = 1;
            C26660o00o00o0 c26660o00o00o0 = this.f92025OooO00o;
            c26660o00o00o0.getClass();
            objOooO00o = c26660o00o00o0.OooO00o(str2, new C26657o00o00O0(str, rectF, null));
            if (objOooO00o != enumC32485OooO00o) {
                c26665o00o0O00 = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO00o);
            return objOooO00o;
        }
        c26665o00o0O00 = c26651o00o0.f91978OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO00o);
        StrokeMapper strokeMapper = c26665o00o0O00.f92026OooO0O0;
        c26651o00o0.f91978OooOo0o = null;
        c26651o00o0.f91979OooOoO = 2;
        Object strokesParallel = strokeMapper.toStrokesParallel((List) objOooO00o, c26651o00o0);
        return strokesParallel == enumC32485OooO00o ? enumC32485OooO00o : strokesParallel;
    }
}
