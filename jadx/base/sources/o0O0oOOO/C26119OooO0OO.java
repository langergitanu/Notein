package o0O0oOOO;

import android.graphics.RuntimeShader;

/* JADX INFO: renamed from: o0O0oOOO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26119OooO0OO {
    public static /* synthetic */ RuntimeShader OooO00o() {
        return new RuntimeShader("\n        // uTile.x = uTile.y = H，瓦片边长\n        uniform float2  uTile;\n        // 线宽（像素）\n        uniform float   uStroke;\n\n        half4 main(float2 p) {\n            float2  pos = mod(p, uTile);\n            float   H   = uTile.x;\n            float   S   = uStroke;\n\n            float dMain = abs(pos.x + pos.y - H);\n\n            float off   = S * 0.3535534;     \n            float dTL   = 1e9;\n            float dBR   = 1e9;\n\n            if (pos.x <= off && pos.y <= off) {\n                dTL = abs(pos.x - pos.y);\n            }\n\n            if (pos.x >= H - off && pos.y >= H - off) {\n                dBR = abs(pos.x - pos.y);\n            }\n\n            float dist = min(dMain, min(dTL, dBR));\n\n            return dist < (S * 0.5) ? half4(1.0) : half4(0.0);\n        }\n    ");
    }
}
