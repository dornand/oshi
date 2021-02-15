/**
 * MIT License
 *
 * Copyright (c) 2010 - 2021 The OSHI Project Contributors: https://github.com/oshi/oshi/graphs/contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
open module com.github.oshi {
    // API
    exports oshi;
    exports oshi.hardware;
    exports oshi.software.os;
    exports oshi.util;

    // required for JNA access
    exports oshi.jna.platform.linux to com.sun.jna;
    exports oshi.jna.platform.mac to com.sun.jna;
    exports oshi.jna.platform.unix to com.sun.jna;
    exports oshi.jna.platform.unix.aix to com.sun.jna;
    exports oshi.jna.platform.unix.freebsd to com.sun.jna;
    exports oshi.jna.platform.unix.openbsd to com.sun.jna;
    exports oshi.jna.platform.unix.solaris to com.sun.jna;
    exports oshi.util.platform.linux to com.sun.jna;
    exports oshi.util.platform.mac to com.sun.jna;
    exports oshi.util.platform.unix.freebsd to com.sun.jna;
    exports oshi.util.platform.unix.openbsd to com.sun.jna;
    exports oshi.util.platform.unix.solaris to com.sun.jna;
    exports oshi.util.platform.windows to com.sun.jna;

    // dependencies
    requires com.sun.jna;
    requires com.sun.jna.platform;
    requires java.desktop;
    requires org.slf4j;
}