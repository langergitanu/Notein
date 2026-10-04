package o0OO0oo0;

import Oooo0oO.C21111o0ooOoO;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Base64;
import androidx.core.app.OooO;
import com.aspose.slides.C22227OoooO;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.Firebase;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.functions.FirebaseFunctions;
import com.google.firebase.functions.FunctionsKt;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.handwriting.RecognizedTextElement;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.C33900OooO0o0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OO0oo0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26947OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public FirebaseFunctions f93599OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C33898OooO0Oo f93600OooO0O0 = C33900OooO0o0.OooO00o();

    public C26947OooO0OO(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
    }

    public static List OooO00o(JsonElement jsonElement) {
        Iterator<JsonElement> it;
        int i;
        Iterator<JsonElement> it2;
        String str;
        String str2;
        boolean zIsJsonArray = jsonElement.isJsonArray();
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        if (zIsJsonArray) {
            JsonArray asJsonArray = jsonElement.getAsJsonArray();
            if (!asJsonArray.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                JsonElement jsonElement2 = asJsonArray.get(0).getAsJsonObject().get("fullTextAnnotation");
                if (jsonElement2 != null) {
                    JsonObject asJsonObject = jsonElement2.getAsJsonObject();
                    String str3 = "text";
                    String asString = asJsonObject.get("text").getAsString();
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooO00o(OooO.OooO0O0(c20358OooO00o, "GoogleOCRDataSource", "Complete annotation: ", asString), new Object[0]);
                    Iterator<JsonElement> it3 = asJsonObject.get("pages").getAsJsonArray().iterator();
                    String str4 = "iterator(...)";
                    OooOOO0.OooO0o(it3, "iterator(...)");
                    int i2 = 0;
                    while (it3.hasNext()) {
                        Iterator<JsonElement> it4 = it3.next().getAsJsonObject().get("blocks").getAsJsonArray().iterator();
                        OooOOO0.OooO0o(it4, str4);
                        String str5 = "";
                        String strOooO0Oo = "";
                        while (it4.hasNext()) {
                            Iterator<JsonElement> it5 = it4.next().getAsJsonObject().get("paragraphs").getAsJsonArray().iterator();
                            OooOOO0.OooO0o(it5, str4);
                            String str6 = str5;
                            while (it5.hasNext()) {
                                JsonElement next = it5.next();
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<JsonElement> it6 = next.getAsJsonObject().get("words").getAsJsonArray().iterator();
                                OooOOO0.OooO0o(it6, str4);
                                String str7 = str5;
                                while (true) {
                                    it = it3;
                                    Iterator<JsonElement> it7 = it6;
                                    i = i2;
                                    it2 = it4;
                                    str = str5;
                                    if (it6.hasNext()) {
                                        Iterator<JsonElement> it8 = it5;
                                        Iterator<JsonElement> it9 = it7.next().getAsJsonObject().get("symbols").getAsJsonArray().iterator();
                                        OooOOO0.OooO0o(it9, str4);
                                        String str8 = str;
                                        while (it9.hasNext()) {
                                            JsonElement next2 = it9.next();
                                            String str9 = str4;
                                            String asString2 = next2.getAsJsonObject().get(str3).getAsString();
                                            String strOooO0Oo2 = C21111o0ooOoO.OooO0Oo(str8, asString2);
                                            String str10 = str3;
                                            JsonArray asJsonArray2 = next2.getAsJsonObject().get("boundingBox").getAsJsonObject().get("vertices").getAsJsonArray();
                                            Iterator<JsonElement> it10 = it9;
                                            JsonElement jsonElement3 = next;
                                            String str11 = strOooO0Oo;
                                            String str12 = str6;
                                            RectF rectF = new RectF(asJsonArray2.get(0).getAsJsonObject().get("x").getAsFloat(), asJsonArray2.get(0).getAsJsonObject().get("y").getAsFloat(), asJsonArray2.get(2).getAsJsonObject().get("x").getAsFloat(), asJsonArray2.get(2).getAsJsonObject().get("y").getAsFloat());
                                            while (true) {
                                                int i3 = i;
                                                if (i3 >= asString.length()) {
                                                    str2 = asString;
                                                    i = i3;
                                                    break;
                                                }
                                                i = i3 + 1;
                                                char cCharAt = asString.charAt(i3);
                                                if (Character.isSpaceChar(cCharAt)) {
                                                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                                    StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o2, "GoogleOCRDataSource", "Add space char. symbol: ", asString2, ", annotationTextChar: ");
                                                    sbOooO00o.append(cCharAt);
                                                    c20358OooO00o2.OooO00o(sbOooO00o.toString(), new Object[0]);
                                                    float f = rectF.left;
                                                    str2 = asString;
                                                    arrayList2.add(new RecognizedTextElement.CharElement(" ", new RectF(f - 1, rectF.top, f, rectF.bottom)));
                                                } else {
                                                    str2 = asString;
                                                    if (OooOOO0.OooO0O0(String.valueOf(cCharAt), asString2)) {
                                                        break;
                                                    }
                                                }
                                                asString = str2;
                                            }
                                            OooOOO0.OooO0Oo(asString2);
                                            arrayList2.add(new RecognizedTextElement.CharElement(asString2, rectF));
                                            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                            StringBuilder sbOooO00o2 = C22227OoooO.OooO00o(c20358OooO00o3, "GoogleOCRDataSource", "Symbol text ", asString2, ", bounding box ");
                                            sbOooO00o2.append(rectF);
                                            c20358OooO00o3.OooO00o(sbOooO00o2.toString(), new Object[0]);
                                            it9 = it10;
                                            str4 = str9;
                                            str3 = str10;
                                            str8 = strOooO0Oo2;
                                            next = jsonElement3;
                                            strOooO0Oo = str11;
                                            asString = str2;
                                            str6 = str12;
                                        }
                                        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o4.OooO00o(OooO.OooO0O0(c20358OooO00o4, "GoogleOCRDataSource", "Word text ", str8), new Object[0]);
                                        str7 = String.format("%s%s ", Arrays.copyOf(new Object[]{str7, str8}, 2));
                                        it5 = it8;
                                        it3 = it;
                                        it6 = it7;
                                        i2 = i;
                                        it4 = it2;
                                        str5 = str;
                                        str4 = str4;
                                        str3 = str3;
                                        next = next;
                                        strOooO0Oo = strOooO0Oo;
                                        asString = asString;
                                        str6 = str6;
                                    }
                                }
                                JsonArray asJsonArray3 = next.getAsJsonObject().get("boundingBox").getAsJsonObject().get("vertices").getAsJsonArray();
                                arrayList.add(new RecognizedTextElement(str7, new RectF(asJsonArray3.get(0).getAsJsonObject().get("x").getAsFloat(), asJsonArray3.get(0).getAsJsonObject().get("y").getAsFloat(), asJsonArray3.get(2).getAsJsonObject().get("x").getAsFloat(), asJsonArray3.get(2).getAsJsonObject().get("y").getAsFloat()), arrayList2));
                                C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o5.OooOOO0("GoogleOCRDataSource");
                                c20358OooO00o5.OooO00o("Paragraph text ".concat(str7), new Object[0]);
                                str6 = str6 + str7;
                                z = false;
                                it5 = it5;
                                it3 = it;
                                i2 = i;
                                it4 = it2;
                                str5 = str;
                                str4 = str4;
                                str3 = str3;
                                strOooO0Oo = strOooO0Oo;
                                asString = asString;
                            }
                            strOooO0Oo = C21111o0ooOoO.OooO0Oo(strOooO0Oo, str6);
                            it3 = it3;
                            str5 = str5;
                        }
                    }
                    return arrayList;
                }
            }
        }
        return c34434OooOoO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0O0(Bitmap bitmap, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26946OooO0O0 c26946OooO0O0;
        Bitmap bitmap2;
        C26947OooO0OO c26947OooO0OO;
        C33898OooO0Oo c33898OooO0Oo;
        Object obj;
        int i;
        Serializable serializable;
        if (abstractC32479OooO0OO instanceof C26946OooO0O0) {
            c26946OooO0O0 = (C26946OooO0O0) abstractC32479OooO0OO;
            int i2 = c26946OooO0O0.f93598OooOoo0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c26946OooO0O0.f93598OooOoo0 = i2 - Integer.MIN_VALUE;
            } else {
                c26946OooO0O0 = new C26946OooO0O0(this, abstractC32479OooO0OO);
            }
        }
        Object obj2 = c26946OooO0O0.f93595OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c26946OooO0O0.f93598OooOoo0;
        Serializable serializable2 = null;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("GoogleOCRDataSource");
                c20358OooO00o.OooO0OO("Image width or height is 0", new Object[0]);
                return null;
            }
            c26946OooO0O0.f93594OooOo0o = this;
            bitmap2 = bitmap;
            c26946OooO0O0.f93593OooOo = bitmap2;
            C33898OooO0Oo c33898OooO0Oo2 = this.f93600OooO0O0;
            c26946OooO0O0.f93596OooOoO0 = c33898OooO0Oo2;
            c26946OooO0O0.f93598OooOoo0 = 1;
            if (c33898OooO0Oo2.OooO00o(c26946OooO0O0) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26947OooO0OO = this;
            c33898OooO0Oo = c33898OooO0Oo2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33898OooO0Oo = c26946OooO0O0.f93596OooOoO0;
            Bitmap bitmap3 = c26946OooO0O0.f93593OooOo;
            c26947OooO0OO = c26946OooO0O0.f93594OooOo0o;
            C32446OooOOOo.OooO0O0(obj2);
            bitmap2 = bitmap3;
        }
        try {
            if (c26947OooO0OO.f93599OooO00o == null) {
                try {
                    c26947OooO0OO.f93599OooO00o = FunctionsKt.getFunctions(Firebase.INSTANCE);
                } catch (Throwable th) {
                    th = th;
                    obj = null;
                    c33898OooO0Oo.OooOOO0(obj);
                    throw th;
                }
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            c33898OooO0Oo.OooOOO0(null);
            int width = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            int i4 = 1024;
            if (height > width) {
                i4 = (int) ((1024 * width) / height);
                i = 1024;
            } else {
                i = width > height ? (int) ((1024 * height) / width) : 1024;
            }
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, i4, i, false);
            OooOOO0.OooO0o(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            OooOOO0.OooO0o(byteArray, "toByteArray(...)");
            String strEncodeToString = Base64.encodeToString(byteArray, 2);
            JsonObject jsonObject = new JsonObject();
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.add(FirebaseAnalytics.Param.CONTENT, new JsonPrimitive(strEncodeToString));
            jsonObject.add("image", jsonObject2);
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.add(C18437z2.f56754h, new JsonPrimitive("DOCUMENT_TEXT_DETECTION"));
            JsonArray jsonArray = new JsonArray();
            jsonArray.add(jsonObject3);
            jsonObject.add("features", jsonArray);
            String string = jsonObject.toString();
            OooOOO0.OooO0o(string, "toString(...)");
            FirebaseFunctions firebaseFunctions = c26947OooO0OO.f93599OooO00o;
            if (firebaseFunctions == null) {
                OooOOO0.OooOOOO("functions");
                throw null;
            }
            Task<TContinuationResult> taskContinueWith = firebaseFunctions.getHttpsCallable("annotateImage").call(string).continueWith(new androidx.core.content.OooO0OO());
            OooOOO0.OooO0o(taskContinueWith, "continueWith(...)");
            try {
                float width2 = bitmap2.getWidth() / bitmapCreateScaledBitmap.getWidth();
                float height2 = bitmap2.getHeight() / bitmapCreateScaledBitmap.getHeight();
                Object objAwait = Tasks.await(taskContinueWith);
                OooOOO0.OooO0o(objAwait, "await(...)");
                List<RecognizedTextElement> listOooO00o = OooO00o((JsonElement) objAwait);
                int i5 = 10;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOooO00o, 10));
                for (RecognizedTextElement recognizedTextElement : listOooO00o) {
                    List<RecognizedTextElement.CharElement> chars = recognizedTextElement.getChars();
                    ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(chars, i5));
                    for (RecognizedTextElement.CharElement charElement : chars) {
                        RectF bounds = charElement.getBounds();
                        serializable = serializable2;
                        try {
                            arrayList2.add(new RecognizedTextElement.CharElement(charElement.getChar(), new RectF(bounds.left * width2, bounds.top * height2, bounds.right * width2, bounds.bottom * height2)));
                            serializable2 = serializable;
                        } catch (Exception e) {
                            e = e;
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o2.OooOOO0("GoogleOCRDataSource");
                            c20358OooO00o2.OooO0OO("annotateImage failed. " + e + " \n " + C32435OooO0Oo.OooO0O0(e), new Object[0]);
                            return serializable;
                        }
                    }
                    Serializable serializable3 = serializable2;
                    RectF bounds2 = recognizedTextElement.getBounds();
                    arrayList.add(new RecognizedTextElement(recognizedTextElement.getText(), new RectF(bounds2.left * width2, bounds2.top * height2, bounds2.right * width2, bounds2.bottom * height2), arrayList2));
                    serializable2 = serializable3;
                    i5 = 10;
                }
                return arrayList;
            } catch (Exception e2) {
                e = e2;
                serializable = serializable2;
            }
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
    }
}
