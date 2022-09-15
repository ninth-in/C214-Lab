import {Schema} from "mongoose";
import mongoose from "mongoose";

export type UserDocument = {
    _id: string; 
    name : string;
    produtora : string;
    atores : string;
    year : number;
}

export const UserSchema: Schema = new Schema({
    name : {type: String, required: true},
    produtora : {type: String, required: true},
    atore : {type: String, required: true},
    year : {type: Number, required: true, unique: true}
});

export default mongoose.model<UserDocument>('User', UserSchema);
