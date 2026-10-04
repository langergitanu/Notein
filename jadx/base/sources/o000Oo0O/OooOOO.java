package o000Oo0O;

import android.graphics.MeshSpecification;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO implements oO0O000o.OooO00o {
    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        OooOO0.OooO00o();
        return MeshSpecification.make(new MeshSpecification.Attribute[]{OooO.OooO00o()}, 8, new MeshSpecification.Varying[0], "Varyings main(const Attributes attributes) {\n     Varyings varyings;\n     varyings.position = attributes.position;\n     return varyings;\n}", "float2 main(const Varyings varyings, out float4 color) {\n       color = vec4(0.0, 0.0, 0.0, 0.0);\n       return varyings.position;\n}");
    }
}
