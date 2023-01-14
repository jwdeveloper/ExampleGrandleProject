package io.github.jwdeveloper.example;

/**
 * Returns an Image object that can then be painted on the screen.
 * argument is a specifier that is relative to the url argument.
 * <p>
 * This method always returns immediately, whether or not the
 * image exists. When this applet attempts to draw the image on
 * the screen, the data will be loaded. The graphics primitives
 * that draw the image will incrementally paint on the screen.
 */
public class ExampleClass
{
    /**
     * method that do stuff
     */
    public void show()
    {
        System.out.println("Hello world");
    }
}
