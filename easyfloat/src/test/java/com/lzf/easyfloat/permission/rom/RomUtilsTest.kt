package com.lzf.easyfloat.permission.rom

import org.junit.Assert.assertEquals
import org.junit.Test

class RomUtilsTest {
    @Test
    fun parseEmuiVersion_handlesValidAndInvalidValues() {
        assertEquals(3.1, RomUtils.parseEmuiVersion("EmotionUI_3.1"), 0.0)
        assertEquals(10.1, RomUtils.parseEmuiVersion("EmotionUI_10.1.0.0"), 0.0)
        assertEquals(4.0, RomUtils.parseEmuiVersion("unknown"), 0.0)
    }
}
