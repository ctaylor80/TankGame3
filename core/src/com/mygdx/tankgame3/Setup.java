package com.mygdx.tankgame3;

/*
 *Displays three buttons. Join server, make server, or create map.
 Clisking each respective button will launch that activity.
 */


//import Server.GameServer;
//import Server.PickMapScreen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import static com.badlogic.gdx.graphics.g3d.particles.ParticleShader.AlignMode.Screen;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import static com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.esotericsoftware.kryonet.Server;
//import com.mygdx.client.GameClient;
//import com.mygdx.game.map.DefualtMaps;
//import com.mygdx.game.map.Tile;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Colin
 */
public class Setup implements Screen {
    
    Stage stage;
    
    TextButton serverButton;
    TextButton mapButton;
    TextButton joinButton;
    
    Table buttonTable;
    
    TextButtonStyle textButtonStyle;
    BitmapFont font;
    Skin skin;
    TextureAtlas buttonAtlas;
    
    //MyGdxGame game;
    OrthographicCamera camera;
    
    public Setup() {
        //Tile.loadAssets();
        //this.game = game;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 20 * 10, 20 * 10);
        
        stage = new Stage();
        Gdx.input.setInputProcessor(stage); //makes the buttons work
        font = new BitmapFont();
        skin = new Skin();
        //buttonAtlas = new TextureAtlas(Gdx.files.internal("buttons/buttons.pack"));
        //skin.addRegions(buttonAtlas);
        textButtonStyle = new TextButtonStyle();
        textButtonStyle.font = font;
        //textButtonStyle.up = skin.getDrawable("up-button");
        //textButtonStyle.down = skin.getDrawable("down-button");
        //textButtonStyle.checked = skin.getDrawable("checked-button");
        serverButton = new TextButton("Start Server", textButtonStyle);
        serverButton.addListener(new ChangeListener() {
            public void changed(ChangeEvent event, Actor actor) {
               // new PickMapScreen(game);
                System.out.println("server Pressed");
                /*Gdx.app.postRunnable(new Runnable() {
                    
                    @Override
                    public void run() {
                        new GameServer(Setup.this.game);
                    }
                });*/

                /*try { 
                    //JOptionPane.showMessageDialog(null, "before making new gameServer");
                 new GameServer(Setup.this.game).start();
                 } catch (IOException ex) {
                 JOptionPane.showMessageDialog(null, ex.getMessage());
                 Logger.getLogger(Setup.class.getName()).log(Level.SEVERE, null, ex);
                 }*/
            }
        });
        
        mapButton = new TextButton("Start map", textButtonStyle);
        mapButton.addListener(new ChangeListener() {
            public void changed(ChangeEvent event, Actor actor) {
                System.out.println("map Pressed");
            }
        });
        
        joinButton = new TextButton("Start join", textButtonStyle);
        joinButton.addListener(new ChangeListener() {
            public void changed(ChangeEvent event, Actor actor) {
                System.out.println("join Pressed");
                //try {
                   // new GameClient(Setup.this.game).start();
                //} catch (IOException ex) {
                //    Logger.getLogger(Setup.class.getName()).log(Level.SEVERE, null, ex);
                //}
            }
        });
        buttonTable = new Table();
        buttonTable.setFillParent(true);
        buttonTable.add(mapButton);
        buttonTable.row();
        buttonTable.add(serverButton);
        buttonTable.row();
        buttonTable.add(joinButton);
        stage.addActor(buttonTable);
//        stage.addActor(mapButton);
//        stage.addActor(serverButton);
//        stage.addActor(joinButton);
        //DefualtMaps.writeMaps();
    }
    
    @Override
    public void render(float f) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
    }
    
    @Override
    public void resize(int i, int i1) {
        
    }
    
    @Override
    public void show() {
        
    }
    
    @Override
    public void hide() {
        
    }
    
    @Override
    public void pause() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void resume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}