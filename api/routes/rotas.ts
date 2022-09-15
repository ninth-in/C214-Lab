import express from "express";
import controller from "../controllers/user.controller";

const router = express.Router();

router
    .get('/filmes', controller.getAll)
    .post('/filme', controller.createUser)
    .get('/filme/:id', controller.getID)
    .delete('/filme/:id', controller.deleteUser)
    .put('/filme/:id', controller.updateUser)
    .patch('/filme/:id', controller.updateName);

export default router;