package o0Oo0OoO;

import Oooo0OO.AbstractC20960OooOOOO;
import android.util.Log;
import com.orion.notein.data.p602db.entity.StrokeEntity;
import com.orion.notein.domain.mapper.StrokeMapper;
import com.orion.notein.domain.models.page.Stroke;
import com.orion.penkit.models.DrawRecord;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import o0OOo0Oo.InterfaceC27323Oooo0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0Oo0OoO.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28132Oooo00O extends AbstractC20960OooOOOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC27323Oooo0oO f99738OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final StrokeMapper f99739OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28132Oooo00O(InterfaceC27323Oooo0oO strokeRepo, StrokeMapper strokeMapper) {
        super(2);
        kotlin.jvm.internal.OooOOO0.OooO0oO(strokeRepo, "strokeRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(strokeMapper, "strokeMapper");
        this.f99738OooOo = strokeRepo;
        this.f99739OooOoO0 = strokeMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00000Oo(String str, Map map, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28131Oooo000 c28131Oooo000;
        if (abstractC32479OooO0OO instanceof C28131Oooo000) {
            c28131Oooo000 = (C28131Oooo000) abstractC32479OooO0OO;
            int i = c28131Oooo000.f99737OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28131Oooo000.f99737OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c28131Oooo000 = new C28131Oooo000(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28131Oooo000.f99736OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28131Oooo000.f99737OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                ArrayList<StrokeEntity> arrayListO00000 = o00000(StrokeEntity.class, str + "/stroke");
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayListO00000, 10));
                for (StrokeEntity strokeEntity : arrayListO00000) {
                    String string = UUID.randomUUID().toString();
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                    Stroke stroke = this.f99739OooOoO0.toStroke(strokeEntity);
                    DrawRecord record = stroke.getRecord();
                    DrawRecord drawRecordCopy$default = record != null ? DrawRecord.copy$default(record, string, 0, 0, 0.0f, null, null, null, 0L, false, null, false, 2046, null) : null;
                    Object obj2 = map.get(stroke.getPageId());
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(obj2);
                    arrayList.add(Stroke.copy$default(stroke, string, (String) obj2, null, System.currentTimeMillis(), drawRecordCopy$default, null, 36, null));
                }
                InterfaceC27323Oooo0oO interfaceC27323Oooo0oO = this.f99738OooOo;
                c28131Oooo000.f99737OooOoO0 = 1;
                if (interfaceC27323Oooo0oO.OooO0o(arrayList, str2, false, c28131Oooo000) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return new Integer(0);
        } catch (Exception e) {
            Log.e("stroke", "Couldn't restore data. " + e);
            return new Integer(-999);
        }
    }
}
