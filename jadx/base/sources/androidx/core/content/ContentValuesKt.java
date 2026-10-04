package androidx.core.content;

import android.content.ContentValues;
import kotlin.Metadata;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"", "LoO00ooO/OooOOO;", "", "", "pairs", "Landroid/content/ContentValues;", "contentValuesOf", "([LoO00ooO/OooOOO;)Landroid/content/ContentValues;", "core-ktx_release"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ContentValuesKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final ContentValues contentValuesOf(C32443OooOOO<String, ? extends Object>... c32443OooOOOArr) {
        ContentValues contentValues = new ContentValues(c32443OooOOOArr.length);
        for (C32443OooOOO<String, ? extends Object> c32443OooOOO : c32443OooOOOArr) {
            String str = c32443OooOOO.f116638OooOo0o;
            B b = c32443OooOOO.f116637OooOo;
            if (b == 0) {
                contentValues.putNull(str);
            } else if (b instanceof String) {
                contentValues.put(str, (String) b);
            } else if (b instanceof Integer) {
                contentValues.put(str, (Integer) b);
            } else if (b instanceof Long) {
                contentValues.put(str, (Long) b);
            } else if (b instanceof Boolean) {
                contentValues.put(str, (Boolean) b);
            } else if (b instanceof Float) {
                contentValues.put(str, (Float) b);
            } else if (b instanceof Double) {
                contentValues.put(str, (Double) b);
            } else if (b instanceof byte[]) {
                contentValues.put(str, (byte[]) b);
            } else if (b instanceof Byte) {
                contentValues.put(str, (Byte) b);
            } else {
                if (!(b instanceof Short)) {
                    throw new IllegalArgumentException("Illegal value type " + b.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                contentValues.put(str, (Short) b);
            }
        }
        return contentValues;
    }
}
