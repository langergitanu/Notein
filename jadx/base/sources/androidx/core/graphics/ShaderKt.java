package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Shader;
import kotlin.Metadata;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m80612d2 = {"Landroid/graphics/Shader;", "Lkotlin/Function1;", "Landroid/graphics/Matrix;", "LoO00ooO/OooOooO;", "block", "transform", "(Landroid/graphics/Shader;LoO0O000o/OooOO0o;)V", "core-ktx_release"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ShaderKt {
    public static final void transform(Shader shader, InterfaceC32507OooOO0o<? super Matrix, C32460OooOooO> interfaceC32507OooOO0o) {
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        interfaceC32507OooOO0o.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
