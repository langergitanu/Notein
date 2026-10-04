package o0Oo0OoO;

import Oooo0OO.AbstractC20960OooOOOO;
import Oooo0oO.C21111o0ooOoO;
import android.util.Log;
import com.orion.notein.data.p602db.entity.TextBoxEntity;
import com.orion.notein.domain.mapper.TextBoxMapper;
import com.orion.notein.domain.models.page.TextBox;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0O0oooO.C26264OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0Oo0OoO.Oooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28130Oooo0 extends AbstractC20960OooOOOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C26264OooOOO0 f99733OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final TextBoxMapper f99734OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28130Oooo0(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, C26264OooOOO0 c26264OooOOO0, TextBoxMapper mapper) {
        super(2);
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        this.f99733OooOo = c26264OooOOO0;
        this.f99734OooOoO0 = mapper;
        abstractApplicationC26277OooOoOO.getExternalFilesDir(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00000Oo(String str, Map map, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C28133Oooo00o c28133Oooo00o;
        if (abstractC32479OooO0OO instanceof C28133Oooo00o) {
            c28133Oooo00o = (C28133Oooo00o) abstractC32479OooO0OO;
            int i = c28133Oooo00o.f99742OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28133Oooo00o.f99742OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c28133Oooo00o = new C28133Oooo00o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28133Oooo00o.f99741OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28133Oooo00o.f99742OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                File file = new File(C21111o0ooOoO.OooO0Oo(str, "/TextBox"));
                if (!file.exists()) {
                    file.mkdir();
                }
                if (!file.exists()) {
                    Log.e("TextBox", "StorageDir is null. " + file);
                    return new Integer(-999);
                }
                ArrayList arrayListO000000o = o000000o(new File(file.getAbsolutePath() + "/data"), TextBoxEntity.class);
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListO000000o.iterator();
                while (it.hasNext()) {
                    TextBox model = this.f99734OooOoO0.toModel((TextBoxEntity) it.next());
                    String string = UUID.randomUUID().toString();
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                    String str3 = (String) map.get(model.getPageId());
                    TextBox textBoxCopy$default = str3 == null ? null : TextBox.copy$default(model, string, str3, null, 0.0f, 0.0f, 0.0f, null, 0.0f, 0, null, 0L, 0, null, 8188, null);
                    if (textBoxCopy$default != null) {
                        arrayList.add(textBoxCopy$default);
                    }
                }
                C26264OooOOO0 c26264OooOOO0 = this.f99733OooOo;
                c28133Oooo00o.f99742OooOoO0 = 1;
                if (c26264OooOOO0.OooO0O0(arrayList, str2, false, c28133Oooo00o) == enumC32485OooO00o) {
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
            e.printStackTrace();
            Log.e("TextBox", "Couldn't restore data. " + C32460OooOooO.f116667OooO00o);
            return new Integer(-999);
        }
    }
}
